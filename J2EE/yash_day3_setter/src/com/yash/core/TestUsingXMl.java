package com.yash.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUsingXMl {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring_beans.xml"))
		{
			Employee employee=context.getBean("emp", Employee.class);
			System.out.println(employee);
		}
	}
}
