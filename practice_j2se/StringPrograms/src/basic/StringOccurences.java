package basic;

import java.util.HashMap;
import java.util.Scanner;

public class StringOccurences {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			String s=sc.nextLine();
			/*char[] c=s.toCharArray();
			HashMap<Character, Integer> hm = new HashMap<>();
			for(char cc:c)
			{
				if(hm.containsKey(cc))
					hm.put(cc, hm.get(cc)+1);
				else
					hm.put(cc, 1);
			}
			hm.forEach((k,v)->System.out.println(k+" "+v));*/
			
			char c[]=s.toCharArray();
			HashMap<Character, Integer> hm=new HashMap<>();
			for(char cc:c)
			{
				if(cc!=' ')
				{
					if(hm.containsKey(cc))
						hm.put(cc, hm.get(cc)+1);
					else
						hm.put(cc, 1);
				}
				
			}
			System.out.println(hm);
		}
	}
}
