package programs;

import java.util.*;
public class String2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		dublicateChar(s);
	}
	public static void dublicateChar(String s)
	{
		char[] ca=s.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<>();
		for(char ch:ca)
		{
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
				hm.put(ch, 1);
		}
		
		hm.forEach((k,v)->
		{
			 
				System.out.println(k+" exists "+v+" times");
		});
	}
}
