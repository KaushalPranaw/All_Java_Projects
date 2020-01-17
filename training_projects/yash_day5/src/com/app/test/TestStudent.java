package com.app.test;

import com.app.core.DotNetStudent;
import com.app.core.Student;

public class TestStudent {

	
	
	public static void main(String[] args) {
		Student javaStudent=new Student(1,"rahul"){
			public void display() {
				System.out.println("Java Students details : "+id+" "+name);
			}
			
			 
		};
		
		Student dotNetStudent=new DotNetStudent();
		dotNetStudent.setId(2);
		dotNetStudent.setName("shubham");
		
		acceptStudent(javaStudent);
		acceptStudent(dotNetStudent);
	}
	
	static void acceptStudent(Student s)
	{
		s.display();
	}
}
