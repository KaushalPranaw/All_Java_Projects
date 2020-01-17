package com.app.core;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add("shalu");
		System.out.println(a.size());
		System.out.println(a.remove(1));
		System.out.println(a.get(1));
		System.out.println(a);
	}
}
