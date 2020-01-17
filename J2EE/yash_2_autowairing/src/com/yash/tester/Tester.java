package com.yash.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.pojos.TextEditor;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring_beans.xml");
		TextEditor text=(TextEditor) context.getBean("text");
		text.spellCheck();
		
		((AbstractApplicationContext) context).registerShutdownHook();;
	}
}
