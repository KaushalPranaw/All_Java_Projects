package com.innerclass.nestedinterface;

public class Tester implements Parent.Child,Parent
{

	
	@Override
	public void show() {
		System.out.println("parent interface");
		
	}

	@Override
	public void msg() {
		System.out.println("child interface");
		
	}

	public static void main(String[] args) {
		Parent.Child child=new Tester();
		child.msg();
		
		Parent parent=new Tester();
		parent.show();
	}
}
