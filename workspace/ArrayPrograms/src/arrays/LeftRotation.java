package arrays;

import java.util.Scanner;

public class LeftRotation 
{

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			int n=sc.nextInt();
			int d=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("Before swap");
			for(int i:a)
			{
				System.out.println(i);
			}
			while(d!=0)
			{
				for(int i=0;i<n-1;i++)
				{
					int t=a[i];
					a[i]=a[i+1];
					a[i+1]=t;
				}
				d--;
			}
			System.out.println("After swap");
			for(int i:a)
			{
				System.out.println(i);
			}
		}
	}
	
	 
	
}
