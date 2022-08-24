package com.hibernate;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Question {

	@Id
	private int qid;
	private String question;
	
	//one question can have many answer
	@OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
	private List<Answer> answer;
	
	// setter getter
	
	public int getQid() {
		return qid;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", question=" + question + ", answer=" + answer + "]";
	}
}
