package com.src.model;

import java.util.List;

public class Question {
	private int queId;
	private String queValue;
	private List<Answer> answers;
	public int getQueId() {
		return queId;
	}
	public void setQueId(int queId) {
		this.queId = queId;
	}
	public String getQueValue() {
		return queValue;
	}
	public void setQueValue(String queValue) {
		this.queValue = queValue;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	
	
	
	

}
