package com.yash.tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.pojos.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("customer.xml"))
		{
			Customer customer=context.getBean("cust",Customer.class);
			customer.display();
		}
	}
}
