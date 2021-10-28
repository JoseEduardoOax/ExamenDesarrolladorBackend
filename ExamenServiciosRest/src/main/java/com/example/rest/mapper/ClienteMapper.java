package com.example.rest.mapper;

import com.example.rest.dtos.ClientePostDTO;
import com.example.rest.dtos.ClientePutDTO;
import com.example.rest.entities.Cliente;

public class ClienteMapper {
	public Cliente toEntity(ClientePostDTO dto) {
		Cliente entity = new Cliente();
		entity.nombre = dto.Nombre;
		entity.Apellidos = dto.Apellidos;
		entity.nombreUsuario = dto.Nombre_Usuario;
		entity.correoElectronico = dto.Correo_Electronico;
		entity.Contraseña = dto.Contraseña;

        return entity;
    }
	
	public void merge(ClientePutDTO dto, Cliente cliente) {
		cliente.Edad = dto.Edad;
		cliente.Estatura = dto.Estatura;
		cliente.Peso = dto.Peso;
		cliente.GEB = dto.GEB;
    }
}
