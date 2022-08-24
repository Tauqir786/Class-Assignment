package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Answer {

	@Id
	private int aid;
	private String answer;
	
	// mapping many to one -unidirectional
	//many answer can have one question
	
	
	@ManyToOne
	@JoinColumn(name="qid")
	private Question question; // entity Reference

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
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

	@Override
	public String toString() {
		return "Answer [aid=" + aid + ", answer=" + answer + ", question=" + question + "]";
	}
	
	
	
}
