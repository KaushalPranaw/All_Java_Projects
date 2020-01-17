package com.app;

import java.util.ArrayList;

public class AraryListR {

		public static void main(String[] args) {
			ArrayList<Integer> a=new ArrayList<>();
			a.add(1);
			a.add(2);
			a.add(3);
			a.add(4);
			a.add(5);
			a.forEach(System.out::println);
			System.out.println(a.size());
			a.remove(0);
			System.out.println("----------");
			a.forEach(System.out::println);
			System.out.println(a.size());
		}
}
