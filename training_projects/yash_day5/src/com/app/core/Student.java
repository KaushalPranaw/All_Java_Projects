package com.app.core;

public class Student {

	 protected int id;
	 protected String name;
	
	 
	public Student() {
		super();
		id=2;
		name="pranaw";
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println(id+" "+name);
	}
	
	 
	
	
}
