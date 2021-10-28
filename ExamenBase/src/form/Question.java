package form;

import model.Persona;

public interface Question{
	
	public void setNextQuestion(Question question);
	
	public Question getNextQuestion();
	
	public void doQuestion(Persona persona);
}
