package com.yash.list;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestUsingAnnotation {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		Question question=context.getBean(Question.class);
		System.out.println(question);
		
		((AbstractApplicationContext) context).close();
		
	}
}
