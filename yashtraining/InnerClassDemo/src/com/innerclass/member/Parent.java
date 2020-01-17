package com.innerclass.member;

public class Parent {

	private int data=30;
	 class Child
	{
		 
		int i=10;
		
		 void display()
		{
			System.out.println("i = "+i);
			System.out.println(data);
		}
	}
	  
	public static void main(String[] args) {
		Parent parent=new Parent();
		Parent.Child child=parent.new Child();
		child.display();
	}
}
