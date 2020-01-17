package com.app.core;

import java.util.BitSet;
import java.util.Scanner;

public class BigSet1 
{
	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			BitSet b1=new BitSet(m);
			BitSet b2=new BitSet(m);
			
			for(int i=0;i<n;i++)
			{
				String op=sc.next();
				int s1=sc.nextInt();
				int s2=sc.nextInt();
				if(op.equals("AND")||op.equals("OR")||op.equals("XOR"))
				{
					if(s1==1)
					{
						switch(op)
						{
							case "AND":
								b1.and(b2);
								break;
							case "OR":
								b1.or(b2);
								break;
							case "XOR":
								b1.xor(b2);
								break; 	
						}
					}
					else
					{
						switch(op)
						{
							case "AND":
								b2.and(b1);
								break;
							case "OR":
								b2.or(b1);
								break;
							case "XOR":
								b2.xor(b1);
								break; 	
						}	
					}
				}
				if(op.equals("SET")||op.equals("FLIP") )
				{
					if(s1==1)
					{
						switch(op)
						{
							case "SET":
								b1.set(s2);
								break;
							case "FLIP":
								b1.flip(s2);
								break;
							 
						}
					}
					else
					{
						switch(op)
						{
							case "SET":
								b2.set(s2);
								break;
							case "FLIP":
								b2.flip(s2);
								break;
							 
						}
					}
				}
				
				
				
			}
			
			
		}
		 
		
		
	}
}
