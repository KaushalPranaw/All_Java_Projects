package programs;

import java.util.Scanner;

public class vowerlConsonent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		if(sc!=null)
			sc.close();
		vowelConsonent(s);
	}
	static void vowelConsonent(String s)
	{
		int vowel=0,consonent=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='A'||s.charAt(i)=='a'||s.charAt(i)=='E'||s.charAt(i)=='e'
					||s.charAt(i)=='I'||s.charAt(i)=='i'||s.charAt(i)=='O'||s.charAt(i)=='o'
					||s.charAt(i)=='U'||s.charAt(i)=='u')
			{
				vowel++;
			}
			else
				consonent++;
		}
		System.out.println(vowel+" "+consonent);
	}
}
