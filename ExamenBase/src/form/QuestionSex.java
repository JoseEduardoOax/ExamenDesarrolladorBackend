package form;

import model.Persona;

public class QuestionSex extends FormPerson{
	@Override
	public void doQuestion(Persona persona) {
		while(true) {
			try {
				System.out.print("Escriba su sexo(H = hombre, M = mujer): ");
				persona.setSexo(handleInput.inputChar());
				break;
			}catch(Exception ex) {
				System.out.println("El sexo debe tener un caracter");
				continue;
			}
		}
		
		if(this.nextQuestion != null)
			this.nextQuestion.doQuestion(persona);
	}
}
