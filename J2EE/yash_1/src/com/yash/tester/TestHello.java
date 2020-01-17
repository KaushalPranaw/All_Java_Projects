package com.yash.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.pojos.Hello;
import com.yash.pojos.HelloIndia;

public class TestHello {

	public static void main(String[] args) {
		/*ApplicationContext context=new ClassPathXmlApplicationContext("spring_beans.xml");
		Hello hello=context.getBean("hello", Hello.class);
		System.out.println(hello.getMsg());
		Hello hello1=context.getBean("hello", Hello.class);
		System.out.println(hello1.getMsg());
		System.out.println(hello==hello1);
		
		((AbstractApplicationContext) context).close();*/
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring_beans.xml");
	/*	Hello hello=(Hello) context.getBean("hello");
		System.out.println(hello.getMsg1());*/
	//	System.out.println(hello.getMsg2());
		
		HelloIndia helloIndia=(HelloIndia) context.getBean("helloIndia");
		System.out.println(helloIndia.getMsg1());
	//	System.out.println(helloIndia.getMsg2());
		System.out.println(helloIndia.getMsg3());
		
		((AbstractApplicationContext) context).close();
	}
}
