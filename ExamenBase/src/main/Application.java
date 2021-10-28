package main;

import controller.PersonaController;
import model.Persona;
import utils.Util;

public class Application {
	
	public static void main(String[] args) {
		PersonaController personaController = new PersonaController();
		personaController.initFormPerson();
	}
}