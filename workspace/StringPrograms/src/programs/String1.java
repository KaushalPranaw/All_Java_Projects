package programs;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string ");
		String s=sc.nextLine();
		System.out.println(reverseString(s));
		
	}
	
	public static String reverseString(String s)
	{
		System.out.println(s.length());
		if(s==null||s=="")
			return s;
		else
		{
			char[] ca=new char[s.length()];
			int j=0;
			int i=s.length()-1;
			while(j<=s.length()-1)
			{
				ca[j]=s.charAt(i);
				j++;
				i--;
			}
			return String.copyValueOf(ca);
		}
	}
}
