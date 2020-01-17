package com.yash.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.core.Employee;

public class Tester {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("list.xml"))
		{
			Question question=(Question) context.getBean("ques");
			System.out.println(question);
		}
	}
}

