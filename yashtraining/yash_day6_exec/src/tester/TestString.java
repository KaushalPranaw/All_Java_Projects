package tester;

import java.util.HashMap;
import java.util.Hashtable;

public class TestString {

	public static void main(String[] args) {
		System.out.println(new char[] {'b','a'}+" abc ");
		System.out.printf("%s","abc");
		/*Hashtable<Integer, String> ht=new Hashtable<>();
		ht.put(1, null);
		System.out.println(ht.keys());*/
		
		HashMap<Integer, String> ht=new HashMap<>();
		ht.put(null, "abc");
		ht.put(1, null);
		ht.put(2, null);
		System.out.println(ht);
	}
}
