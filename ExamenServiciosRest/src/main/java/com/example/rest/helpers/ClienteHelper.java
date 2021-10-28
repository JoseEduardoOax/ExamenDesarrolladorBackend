package com.example.rest.helpers;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.dtos.ClientePostDTO;
import com.example.rest.dtos.ClientePutDTO;
import com.example.rest.entities.Cliente;
import com.example.rest.mapper.ClienteMapper;
import com.example.rest.repositories.ClienteRepository;

@Service
public class ClienteHelper {
	private ClienteMapper clienteMapper;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public ClienteHelper() {
		clienteMapper = new ClienteMapper();
	}
	
	public List<Cliente> getClientes(){
		return (List<Cliente>) clienteRepository.findAll();
	}
	
	public Optional<Cliente> getClienteById(long id){
		return clienteRepository.findById(id);
	}
	
	public Cliente saveCliente(ClientePostDTO clienteDTO) {
		Cliente cliente = clienteMapper.toEntity(clienteDTO);
		cliente.Fecha_Creacion = Calendar.getInstance().getTime();
		cliente.Fecha_Actualizacion = Calendar.getInstance().getTime();
		clienteRepository.save(cliente);
		
		return cliente;
	}
	
	public Cliente updatedCliente(Cliente cliente, ClientePutDTO clienteDTO) {
		clienteMapper.merge(clienteDTO, cliente);
		cliente.Fecha_Actualizacion = Calendar.getInstance().getTime();
		clienteRepository.save(cliente);
		
		return cliente;
	}
	
	public boolean existeNombre(String nombre) {
		Optional<Cliente> cliente = clienteRepository.findByNombreUsuario(nombre);
		
		return cliente.isPresent();
	}
	
	public boolean existeCorreo(String correo) {
		Optional<Cliente> cliente = clienteRepository.findByCorreoElectronico(correo);
		
		return cliente.isPresent();
	}
}
