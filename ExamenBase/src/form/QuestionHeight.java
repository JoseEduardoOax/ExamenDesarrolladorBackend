package form;

import model.Persona;

public class QuestionHeight extends FormPerson{
	@Override
	public void doQuestion(Persona persona) {
		while(true) {
			try {
				System.out.print("Escriba su altura en metros: ");
				persona.setAltura(handleInput.inputFloat());
				break;
			}catch(Exception ex) {
				System.out.println("La altura debe ser un numero");
				continue;
			}
		}
		
		
		if(this.nextQuestion != null)
			this.nextQuestion.doQuestion(persona);
	}
}
