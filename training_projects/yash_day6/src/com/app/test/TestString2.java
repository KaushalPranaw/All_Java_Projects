package com.app.test;

public class TestString2 {

	public static void main(String[] args) {
		String fName="pranaw";
		String lName="kaushal";
		String name=fName+" "+lName;
		System.out.println(name);
		System.out.println("Reverse : ");
		name=name.substring(fName.length()+1,name.length())+" "+name.substring(0,fName.length());
		System.out.println(name);
		
		
	}
}
