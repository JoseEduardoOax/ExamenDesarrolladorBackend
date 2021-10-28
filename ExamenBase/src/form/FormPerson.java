package form;

import form.Question;
import input.HandleInput;
import input.InputScanner;
import model.Persona;

public class FormPerson implements Question
{
	protected Question nextQuestion;
	protected static HandleInput handleInput;
	
	public FormPerson() {
		handleInput = new InputScanner();
	}
	
	public void setNextQuestion(Question question) {
		this.nextQuestion = question;
	}

	@Override
	public Question getNextQuestion() {
		return nextQuestion;
	}

	@Override
	public void doQuestion(Persona persona) {
		QuestionName questionName = new QuestionName();
		this.setNextQuestion(questionName);
		
		QuestionAge questionAge = new QuestionAge();
		questionName.setNextQuestion(questionAge);
		
		QuestionSex questionSex = new QuestionSex();
		questionAge.setNextQuestion(questionSex);
		
		QuestionWeight questionWeight = new QuestionWeight();
		questionSex.setNextQuestion(questionWeight);
		
		QuestionHeight questionHeight = new QuestionHeight();
		questionWeight.setNextQuestion(questionHeight);
		
		nextQuestion.doQuestion(persona);
	}
}
