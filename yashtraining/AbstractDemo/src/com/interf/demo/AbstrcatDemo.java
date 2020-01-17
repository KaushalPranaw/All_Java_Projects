package com.interf.demo;

public abstract class AbstrcatDemo implements Interf {

	public void c()
	{
		System.out.println("c()");
	}
	 
	public static void main(String[] args) {
		AbstrcatDemo a=new AbstrcatDemo() {
			
			@Override
			public void d() {
				System.out.println("d()");
				
			}
			
			@Override
			public void b() {
				System.out.println("d()");
				
			}
			
			@Override
			public void a() {
				System.out.println("d()");
				
			}
		};
		a.c();
		a.b();
		a.c();
		a.d();
		
	}
}
