package ontoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Answer {
	@Id
	@Column(name = "answer_id")
	private int answerId;
	private String answer;
	@OneToOne
	private Question question;
	
	//public Answer(int answerId, String answer, Question question) {
	//	super();
	//	this.answerId = answerId;
	//	this.answer = answer;
	//	this.question = question;
	//}
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	}


