package com.yash.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.core.Employee;

public class Tester {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("list1.xml"))
		{
			Student s= (Student)context.getBean("student");
			System.out.println(s);
		}
	}
}

