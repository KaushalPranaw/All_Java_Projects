package com.app.test;

public class TestString {

	public static void main(String[] args) {
		
		String name="pranawkaushal";
		System.out.println(name);
		
		/*name=name.toUpperCase();
		System.out.println("upper case :"+ name);
		
		System.out.print("reverse :");
		name=new StringBuffer(name).reverse().toString().toLowerCase();
		 
		System.out.println(name);*/
		
		char nameToArray[]=name.toCharArray();
		
		System.out.println(nameToArray);
		
		/*for(char c:nameToArray)
			System.out.print(c+" ");*/
		
		String s=new String("abc");
		StringBuilder sb=new StringBuilder(s);
		System.out.println("abc "+sb);
		
		/*int arr[]={1,2,3};
		System.out.println(arr);*/
		
		char c1[]=new char[name.length()];
		int j=0;
		for(int i=0;i<name.length();i++)
		{
			c1[j++]=name.charAt(i);
		}
		System.out.println("a"+c1);
		char c2[]={'a','b'};
		System.out.println("a"+c2);
	}
}
