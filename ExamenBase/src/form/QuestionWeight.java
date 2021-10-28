package form;

import model.Persona;

public class QuestionWeight extends FormPerson{
	
	@Override
	public void doQuestion(Persona persona) {
		
		while(true) {
			try {
				System.out.print("Escriba su peso en kg: ");
				persona.setPeso(handleInput.inputFloat());
				break;
			}catch(Exception ex) {
				System.out.println("El peso debe ser un numero");
				continue;
			}
		}
		
		if(this.nextQuestion != null)
			this.nextQuestion.doQuestion(persona);
	}
}
