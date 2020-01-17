package com.yash.core;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestUsingAnnotation {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee=context.getBean(Employee.class);
		System.out.println(employee);
		
		((AbstractApplicationContext) context).close();
		
	}
}
