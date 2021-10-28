package com.example.rest.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class ClientePostDTO {
	public String Nombre;
	public String Apellidos;
	
	@NotEmpty(message = "Nombre de usuario no debe de estar vacio")
	public String Nombre_Usuario;
	
	@NotEmpty
	@Email(message = "Inserte un email valido")
	public String Correo_Electronico;
	public String Contraseña;
}
