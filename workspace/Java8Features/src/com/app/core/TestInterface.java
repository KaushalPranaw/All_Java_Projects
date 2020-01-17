package com.app.core;

public interface TestInterface {

	public void square(int a);
	
	default void testDefault()
	{
		System.out.println("default is called");
	}
	
	static void testStatic()
	{
		System.out.println("static is called");
	}
}
