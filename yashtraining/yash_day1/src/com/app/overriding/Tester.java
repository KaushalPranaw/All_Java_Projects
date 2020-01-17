package com.app.overriding;

public class Tester extends Adder {

	@Override
	public int add(int a, int b) {
		int c=10;
		 System.out.println("child");
		 return a+b+c;
	}

	public static void main(String[] args) {
		Tester tester=new Tester();
		System.out.println(tester.add(2, 3));
		Adder a=new Tester();
		if(a instanceof Tester)
		{
			Tester tester1=(Tester)a;
		}
			 
	}
	
}