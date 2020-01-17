package com.pattern;

public class pattern4 {
	public static void main(String[] args) {
	 int n=10;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(2*n-1);j++)
			{
				if(i%2==j%2)
					System.out.print(" ");
				else if(j>=n+1-i&&j<=n-1+i)
					System.out.print("*"); 
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
