package com.app.core;

public class Vendor {
	

	 static class A
	 {
		 static void display()
		 {
			 System.out.println("A()");
		 }
		 static class C
		 {
			 static void display()
			 {
				 System.out.println("C()");
			 }
			 interface B
			 {
				 static void display()
				 {
					 System.out.println("B()");
				 }
				 class D
				 {
					 static void display()
					 {
						 System.out.println("D()");
					 }
					 interface E
					 {
						 static void display()
						 {
							 System.out.println("E()");
						 }
						 int c();
					 }
				 }
				 int b();
			 }
		 }
		 
	 }
	 public static void main(String[] args) {
		System.out.println("a");
	}
}
