package programs;

import java.util.Scanner;

public class ReverseUsingRecursion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		reverse(s);
	}
	static void reverse(String s)
	{
		if(s.equals(""))
			System.out.println(s);
		else
			{
				System.out.print(s.charAt(s.length()-1));
				reverse(s.substring(0, s.length()-1));
			}
		
	}
}
