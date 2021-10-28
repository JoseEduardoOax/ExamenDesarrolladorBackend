package com.example.rest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.rest.entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
	
	Optional<Cliente> findByNombreUsuario(String nombre);
	Optional<Cliente> findByCorreoElectronico(String correo);
}
