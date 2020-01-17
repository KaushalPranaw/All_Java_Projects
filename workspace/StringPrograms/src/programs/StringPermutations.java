package programs;

import java.util.Scanner;

public class StringPermutations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		System.out.println("permutation of "+s+" : ");
		permutation(s,0,s.length()-1);
	}
	public static void permutation(String s,int l,int r)
	{
		
		if(l==r)
		{
			System.out.println(s);
		}
			
		else
		{
			for(int i=l;i<=r;i++)
			{
				s=swap(s,l,i);
				permutation(s, l+1, r);
				s=swap(s,l,i);
			}
		}
	}
	public static String swap(String s,int i,int j)
	{
		char temp;
		char[] sa=s.toCharArray();
		temp=sa[i];
		sa[i]=sa[j];
		sa[j]=temp;
		return String.copyValueOf(sa);
	}
}
