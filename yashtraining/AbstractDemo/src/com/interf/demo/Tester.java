package com.interf.demo;

public class Tester {

	public static void main(String[] args) {
		/* 
		Interf i=new InterfImpl();
		i.a();
		i.b();
		i.c();
		i.d();*/
		
		AbstrcatDemo a=new InterfImpl();
		a.a();
		a.b();
		a.c();
		a.d();
		Tester t=new Tester();
		System.out.println(t);
	}
}
