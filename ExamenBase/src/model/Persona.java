package model;

import utils.Peso;
import utils.Util;

public class Persona {
	public final static char SEXO_DEFAULT = 'H';
	
	private String nombre;
	private int edad;
	private char sexo;
	private float peso;
	private float altura;
	private String NSS;
	private Peso pesoConstante;
	
	public Persona() {
		setNombre("");
		this.edad = 0;
		this.sexo = SEXO_DEFAULT;
		this.peso = 0;
		this.altura = 0;
		this.generaNSS();
	}
	
	public Persona(String nombre, int edad, char sexo, float peso, float altura) {
		setNombre(nombre);
		setEdad(edad);
		setSexo(sexo);
		setPeso(peso);
		setAltura(altura);
		this.generaNSS();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if(edad < 0 || edad > 100)
			this.edad = 0;
		else
			this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		if(this.comprobarSexo(sexo))
			this.sexo = Character.toUpperCase(sexo);
		else
			this.sexo = SEXO_DEFAULT;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		if(peso < 0)
			this.peso = 0;
		else
			this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public boolean esMayorDeEdad() {
		return edad > 18;
	}
	
	public boolean comprobarSexo(char sexo) {
		
		return "HhMm".indexOf(sexo) >= 0;
	}
	
	public int calcularIMC() {
		float imc = Util.IMC(peso, altura);
		
		if(sexo == 'h')
			return pesoIdealHombre(imc);
		else
			return pesoIdealMujer(imc);
	}
	
	private int pesoIdealHombre(float imc) {
		if(imc < 20) {
			pesoConstante = Peso.FALTA_PESO;
			
		}else if(imc > 25){
			pesoConstante = Peso.SOBREPESO;
		}else {
			pesoConstante = Peso.IDEAL;
		}
		
		return pesoConstante.getValor();
	}
	
	private int pesoIdealMujer(float imc) {
		if(imc < 19) {
			pesoConstante = Peso.FALTA_PESO;
		}else if(imc > 24){
			pesoConstante = Peso.SOBREPESO;
		}else {
			pesoConstante = Peso.IDEAL;
		}
		
		return pesoConstante.getValor();
	}
	
	private void generaNSS() {
		this.NSS = Util.randomAlphaNumericString(8);
	}
	
	
	public String toString()
	{
		return "Nombre: " + nombre
				+ "\nEdad: " + edad
				+ "\nNSS: " + NSS
				+ "\nSexo: " + sexo
				+ "\nPeso: " + peso
				+ "\nAltura: " + altura
				+ "\nMayor de edad: " + (esMayorDeEdad() ? "Si" : "No")
				+ "\nIMC calculado: " + calcularIMC() + " = " + pesoConstante.toString();
	}
}
