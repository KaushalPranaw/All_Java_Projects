package com.innerclass.local;

public class Parent {

	private int data=30;
	void display()
	{
		int n=10;//till jdk 1.7 it should be final but not non-final can also be accessed
		class Child
		{
			void msg()
			{
				System.out.println(n);
				System.out.println(data);
			}
		}
		Child child=new Child();
		child.msg();
	}
	  
	public static void main(String[] args) {
		Parent parent=new Parent();
		parent.display();
	}
}
