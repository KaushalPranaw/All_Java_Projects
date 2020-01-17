package com.app.overriding;

import java.io.IOException;

public class Adder {

	public int add(int a,int b) throws ArithmeticException
	{
		System.out.println("parent");
		return a+b;
	}
}
