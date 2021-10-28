package com.example.rest.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	public Long Cliente_ID;
	
	@Column(name = "Nombre_Usuario")
	public String nombreUsuario;
	
	public String Contraseña;
	
	@Column(name="Nombre")
	public String nombre;
	public String Apellidos;
	
	@Column(name="Correo_Electronico")
	public String correoElectronico;
	public int Edad;
	
	@Column(columnDefinition="Decimal(10,2)")
	public double Estatura;
	
	@Column(columnDefinition="Decimal(10,2)")
	public double Peso;
	
	@Column(columnDefinition="Decimal(10,2)")
	public double IMC;
	
	@Column(columnDefinition="Decimal(10,2)")
	public double GEB;
	
	@Column(columnDefinition="Decimal(10,2)")
	public double ETA;
	
	public Date Fecha_Creacion;
	
	public Date Fecha_Actualizacion;
	
}
