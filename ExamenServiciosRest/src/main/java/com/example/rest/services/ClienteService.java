package com.example.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.dtos.ClientePostDTO;
import com.example.rest.dtos.ClientePutDTO;
import com.example.rest.entities.Cliente;
import com.example.rest.helpers.ClienteHelper;
import com.example.rest.wrapper.ResponseWrapper;
import com.example.rest.wrapper.ResponseWrapperCreated;
import com.example.rest.wrapper.ResponseWrapperError;
import com.example.rest.wrapper.ResponseWrapperSuccess;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteHelper clienteHelper;
	
	public ResponseWrapper<List<Cliente>> getClientes(){
		List<Cliente> clientes = clienteHelper.getClientes();
		ResponseWrapper<List<Cliente>> response;
		
		if(clientes.isEmpty()) {
			response = new ResponseWrapperSuccess<>("No hay clientes registrados", clientes);
		}else {
			response = new ResponseWrapperSuccess<>("Clientes obtenidos", clientes);
		}
		
		return response;
	}
	
	public ResponseWrapper<Cliente> getClienteById(long id) {
		Optional<Cliente> cliente = clienteHelper.getClienteById(id);
		ResponseWrapper<Cliente> response;
		
		if(cliente.isPresent()) {
			response = new ResponseWrapperSuccess<Cliente>("Cliente obtenido", cliente.get());
		}else {
			response = new ResponseWrapperError<Cliente>("Cliente no encontrado");
		}
		
		return response;
	}
	
	public ResponseWrapper<Cliente> saveCliente(ClientePostDTO clienteDTO) {
		ResponseWrapper<Cliente> response;
		
		boolean existeCliente = clienteHelper.existeNombre(clienteDTO.Nombre);
		
		if(existeCliente) {
			response = new ResponseWrapperError<>("Ya existe un cliente con ese nombre de usuario");
		}else {
			boolean existeCorreo = clienteHelper.existeCorreo(clienteDTO.Correo_Electronico);
			
			if(existeCorreo) {
				response = new ResponseWrapperError<>("Ya existe un cliente con ese correo");
			}else {
				Cliente cliente = clienteHelper.saveCliente(clienteDTO);
				
				response = new ResponseWrapperCreated<Cliente>("Cliente Creado", cliente);
			}
			
		}
		
		return response;
	}
	
	public ResponseWrapper<Cliente> updatedCliente(ClientePutDTO clienteDTO, Long id) {
		Optional<Cliente> cliente = clienteHelper.getClienteById(id);
		ResponseWrapper<Cliente> response;
		
		if(cliente.isPresent()) {
			Cliente clienteUpdate = clienteHelper.updatedCliente(cliente.get(), clienteDTO);
			response = new ResponseWrapperSuccess<Cliente>("Cliente actualizado", clienteUpdate);
		}else {
			response = new ResponseWrapperError<Cliente>("Cliente no encontrado");
		}
		
		return response;
	}
}
