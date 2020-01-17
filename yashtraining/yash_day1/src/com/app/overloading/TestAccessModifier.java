package com.app.overloading;

import java.io.IOException;

public class TestAccessModifier {

	int add(int a,int b) throws IOException
	{
		System.out.println("int");
		return a+b;
	}
	public long add(int a,long b) throws ArithmeticException
	{
		System.out.println("long");
		return a+b;
	}
	
	public static void main(String[] args) throws Exception {
		TestAccessModifier tester=new TestAccessModifier();
		System.out.println(tester.add(2, 3));
		
	}
	
	
	
}
