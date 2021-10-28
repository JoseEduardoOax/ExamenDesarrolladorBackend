package controller;

import form.FormPerson;
import model.Persona;

public class PersonaController {
	
	public void initFormPerson() {
		FormPerson form = new FormPerson();
		Persona persona = new Persona();
		form.doQuestion(persona);
		
		showPersona(persona);
	}
	
	public void showPersona(Persona persona) {
		System.out.println("\nDatos Persona");
		System.out.println(persona.toString());
	}
}