package form;

import model.Persona;

public class QuestionAge extends FormPerson{
	@Override
	public void doQuestion(Persona persona) {
		while(true) {
			try {
				System.out.print("Escriba su edad: ");
				persona.setEdad(handleInput.inputInt());
				break;
			}catch(Exception ex) {
				System.out.println("La edad debe ser entero");
				continue;
			}
		}
		
		if(this.nextQuestion != null)
			this.nextQuestion.doQuestion(persona);
	}
}
