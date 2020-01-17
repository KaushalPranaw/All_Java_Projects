package com.app.overriding2;

import java.io.IOException;

import com.app.overriding.Adder;

public class Tester extends Adder {

	@Override
	public int add(int a, int b) throws ArithmeticException {
		int c=10;
		 System.out.println("child");
		 return a+b+c;
	}

	public static void main(String[] args) throws ArithmeticException {
		Tester tester=new Tester();
		System.out.println(tester.add(2, 3));
	}
	
}