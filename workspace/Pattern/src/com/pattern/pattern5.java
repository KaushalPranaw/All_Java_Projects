package com.pattern;

public class pattern5 {
	public static void main(String[] args) {
		int k,n,t;
		for(int i=1;i<=4;i++)
		{
			k=0;
			t=0;
			for(int j=1;j<=7;j++)
			{ 
				 if(j>=5-i&&j<=3+i)
				 {
					if(k<i-1)
						 System.out.print(i+k++);
					 else
						 System.out.print(i+k-(t++));
				 }
				 else
					 System.out.print(" ");
			}
			System.out.println();
		}
	}
}
