package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MappingDemo {

	public static void main(String args[]) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
		
  /*   Question q1= new Question();
    	q1.setQid(501);
    	q1.setQuestion("What is Java ?");
    
    	
    	
     Answer a1 = new Answer();
    	a1.setAid(901);
    	a1.setAnswer("Java Is Programming Language");
    	a1.setQuestion(q1);
    	
    	
     Answer a2 = new Answer();
    	a2.setAid(902);
    	a2.setAnswer("Java is Easy to Learn");
    	a2.setQuestion(q1);
    	
    	
    	Answer a3 = new Answer();
    	a3.setAid(903);
    	a3.setAnswer("Java is Platform Independent");
    	a3.setQuestion(q1);
    	
    	
    	List<Answer> answer= new ArrayList<>();
    	answer.add(a1);
    	answer.add(a2);
    	answer.add(a3);
    	
    	
    	
    	q1.setAnswer(answer);
    	session.save(q1);
    	
    	tx.commit();
    	*/
    	
    	// fetching record
    	Question question = (Question)session.get(Question.class,501);
    	System.out.println("Question :"+question.getQuestion());
    	
    	System.out.println("Answer are : ");
    	for(Answer ans : question.getAnswer())
    	{
    	System.out.println("Answer : "+ans.getAnswer());
    	}
    	session.close();
        factory.close();
	}
}
