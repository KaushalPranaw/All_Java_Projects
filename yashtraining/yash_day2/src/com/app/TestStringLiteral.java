package com.app;

public class TestStringLiteral {

	public static void main(String[] args) {
		String s = "abc";
		System.out.println(s.hashCode());
			s="www";
			System.out.println(s.hashCode());
		String s1 = "abc";
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
	}
}
