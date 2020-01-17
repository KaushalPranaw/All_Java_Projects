package com.demo;

public class AssertDemo {

	static void test1(int val)
	{
		assert(val<100);
	}
	static void test2(int val)
	{
		assert(val<100):"should be less than 100";
	}
	static void test3(int val)
	{
		assert(val<100):getMessage();
	}
	private static String getMessage()
	{
		return "should be less than 100";
	}
	public static void main(String[] args) {
		test2(150);
	}
}
