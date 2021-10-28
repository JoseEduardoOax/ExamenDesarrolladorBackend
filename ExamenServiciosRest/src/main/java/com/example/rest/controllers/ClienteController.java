package com.example.rest.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.dtos.ClientePostDTO;
import com.example.rest.dtos.ClientePutDTO;
import com.example.rest.entities.Cliente;
import com.example.rest.services.ClienteService;
import com.example.rest.wrapper.ResponseWrapper;

@RestController
@RequestMapping("/NutriNET/Cliente")
public class ClienteController {
	@Autowired
	ClienteService clienteService;
	
	@GetMapping()
	public ResponseEntity<ResponseWrapper<List<Cliente>>> getClientes(){
		ResponseWrapper<List<Cliente>> response = clienteService.getClientes();
		
		return ResponseEntity.status(response.getStatusCode()).body(response);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ResponseWrapper<Cliente>> getClienteById(@PathVariable long id){
		ResponseWrapper<Cliente> response = clienteService.getClienteById(id);
		
		return ResponseEntity.status(response.getStatusCode()).body(response);
	}
	 
	@PostMapping()
	public ResponseEntity<ResponseWrapper<Cliente>> saveCliente(@Valid @RequestBody ClientePostDTO cliente) {
		ResponseWrapper<Cliente> response = clienteService.saveCliente(cliente);
		
		return ResponseEntity.status(response.getStatusCode()).body(response);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<ResponseWrapper<Cliente>> updatedCliente(@PathVariable long id, @RequestBody ClientePutDTO cliente) {
		ResponseWrapper<Cliente> response = clienteService.updatedCliente(cliente, id);
		return ResponseEntity.status(response.getStatusCode()).body(response);
	}
}
