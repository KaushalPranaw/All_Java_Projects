package com.app.core;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class deque {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			Deque deque=new ArrayDeque<>();
			int n=sc.nextInt();
			int m=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				deque.add(sc.nextInt());
			}
			HashSet hs=new HashSet<>();
			hs.addAll(deque);
			System.out.println(deque.size());

		}
	}
}
