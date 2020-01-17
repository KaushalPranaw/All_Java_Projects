package com.app.core1;

public class Student {

	int id;
	String name;
	String email;
	int age;
	double gpa;
	public Student(int id, String name, String email, int age, double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.gpa = gpa;
	}
 
	public String fetchDetails()
	{
		return "id = "+id+", Name = "+name+" ,Email = "+email+" , Age = "+age+" , Gpa = "+gpa;
	}
}
