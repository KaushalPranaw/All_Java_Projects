package com.innerclass.nestedinterface;

import com.innerclass.nestedinterface.Parent1.Child1;

public class Tester1 implements Parent1.Child1
{
	
	 
	@Override
	public void msg() {
		System.out.println("msg");
		
	}

	public static void main(String[] args) {
		Parent1.Child1 child=(Child1) new Tester1();
		child.msg();
		
		 
	}

	
}
