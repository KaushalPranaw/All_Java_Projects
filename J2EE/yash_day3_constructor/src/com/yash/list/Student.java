package com.yash.list;

public class Student {

	private String name;
	private Question question;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, Question question) {
		super();
		this.name = name;
		this.question = question;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", question=" + question + "]";
	}
	
	
}
