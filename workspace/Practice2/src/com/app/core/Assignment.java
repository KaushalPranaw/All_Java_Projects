package com.app.core;

public class Assignment {

	public static void main(String[] args) {
		Tank t1=new Tank(10);
		Tank t2=new Tank(20);
		System.out.println("1: t1.level : "+t1.getLevel()+", t2.level: "+t2.getLevel());
		t1=t2;
		System.out.println("2: t1.level : "+t1.getLevel()+", t2.level: "+t2.getLevel());
		t1.setLevel(30);
		System.out.println("3: t1.level : "+t1.getLevel()+", t2.level: "+t2.getLevel());
		t1.setLevel(t1.getLevel()+50);
		System.out.println("4: t1.level : "+t1.getLevel()+", t2.level: "+t2.getLevel());
		
		
	}
}
