package com.app.core;

public class TestClass implements TestInterface {

	public void square(int a)
	{
		System.out.println(a*a);
	}
	
	public static void main(String[] args) {
		TestClass t=new TestClass();
		t.square(5);
		t.testDefault();
		TestInterface.testStatic();
	}
}
