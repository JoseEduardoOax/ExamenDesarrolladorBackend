package form;

import model.Persona;

public class QuestionName extends FormPerson{
	
	@Override
	public void doQuestion(Persona persona) {
		System.out.print("Escriba su nombre: ");
		persona.setNombre(handleInput.inputString());
		
		if(this.nextQuestion != null)
			this.nextQuestion.doQuestion(persona);
	}

}
