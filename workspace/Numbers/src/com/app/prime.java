package com.app;

public class prime {

	public static void main(String[] args) {
		int count=0;
		for(int i=2;i<=10000;i++)
		{
			 for(int j=1;j<=i;j++)
			 {
				 if(i%j==0)
					 count++;
			 }
			 if(count==2)
				 System.out.println(i);
			 count=0;
		}
	}
}
