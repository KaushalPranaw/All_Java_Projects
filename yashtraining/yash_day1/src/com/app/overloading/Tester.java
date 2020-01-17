package com.app.overloading;

public class Tester {

	int add(int a,int b)
	{
		System.out.println("int");
		return a+b;
	}
	/*int add(int a,int b)
	{
		return a+b;
	}*/
	int add(short a,short b)
	{
		System.out.println("short");
		return a+b;
	}
	long add(long a,int b)
	{
		System.out.println("long int");
		return a+b;
	}
	
	long add(long a,long b)
	{
		System.out.println("long long");
		return a+b;
	}
	
	 public static void main(String[] args) {
		 Tester tester =new Tester();
		 
		System.out.println(tester.add(2, 5L));
	}
	 
}
