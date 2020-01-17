package com.app.core;

import java.util.ArrayList;

public class Prog1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println(a);
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		//System.out.println(a.remove(1));
		System.out.println(a.size());
		System.out.println(a.clone());
		System.out.println(a.indexOf(20)+" "+a.lastIndexOf(20));
		System.out.println(a.toArray()[1]);
	}
}
