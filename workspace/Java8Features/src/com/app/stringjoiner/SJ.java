package com.app.stringjoiner;

import java.util.StringJoiner;

public class SJ {

	public static void main(String[] args) {
		StringJoiner s=new StringJoiner(",");
		s.add("p");
		s.add("r");
		s.add("a");
		s.add("n");
		s.add("a");
		s.add("w");
		StringJoiner s1=new StringJoiner(",");
		s1.add("k");
		s1.add("a");
		s1.add("u");
		s1.add("s");
		s1.add("h");
		s1.add("a");
		s1.add("l");
		System.out.println(s.merge(s1));
	}
}
