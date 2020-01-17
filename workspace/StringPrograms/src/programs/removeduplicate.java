package programs;

import java.util.*;
import java.util.Scanner;

public class removeduplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Set<Character> hs=new TreeSet<>();
		for(char c:s.toCharArray())
		{
			hs.add(c);
		}
		hs.forEach(System.out::println);
	}
}
