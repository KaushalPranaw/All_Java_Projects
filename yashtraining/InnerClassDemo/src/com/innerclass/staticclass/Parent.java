package com.innerclass.staticclass;

public class Parent {

/*	private int data=30;// cant accessed by static class bcz of non static variable
*/	 
	private static int data=20;
	static class Child
	{
		 
		 
		static int i=10;
		 void display()
		{
			System.out.println("i = "+i);
			System.out.println(data);
		}
	}
	  
	public static void main(String[] args) {
		Parent.Child child=new Parent.Child();
		child.display();
	}
}
