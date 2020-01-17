package practice;

import java.util.StringJoiner;

public class TesterStringJoiner {

	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner(",", "{-","---}");
		sj.add("a");
		sj.add("b");
		sj.add("c");
		sj.add("d");
		StringJoiner sj2=new StringJoiner(",", "[","]");
		sj2.add("a");
		sj2.add("b");
		sj2.add("c");
		sj2.add("d");
		StringJoiner sj3=sj2.merge(sj);
		System.out.println(sj3);
	}
}
