package com.innerclass.staticclass;

public class Parent1 {

/*	private int data=30;// cant accessed by static class bcz of non static variable
*/	 
	private static int data=20;
	static class Child
	{
		 
		 
		static int i=10;
		 static void display()
		{
			System.out.println("i = "+i);
			System.out.println(data);
		}
	}
	  
	public static void main(String[] args) {
		 Parent1.Child.display();
	}
}
