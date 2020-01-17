package com.yash.tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.core.Employee;

public class TestCIUsingXML {

	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		 Employee employee =  (Employee) context.getBean("emp");
		 System.out.println(employee);
		 context.close();
	}
}
