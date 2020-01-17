package programs;

import java.util.Arrays;
import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		boolean b=anagram(s1,s2);
		if(b==true)
			System.out.println("anagram");
		else
			System.out.println("not");
	}
	public static boolean anagram(String s1,String s2)
	{
		s1=s1.replaceAll(" ", "");
		s2=s2.replaceAll(" ", "");
		boolean status =true;
		if(s1.length()!=s2.length())
			status=false;
		else
		{
			char []sa1=s1.toLowerCase().toCharArray();
			char []sa2=s2.toLowerCase().toCharArray();
			Arrays.sort(sa1);
			Arrays.sort(sa2);
			status=Arrays.equals(sa1, sa2);
		}
		return status;
	}
}
