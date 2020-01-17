package com.threaddemo;

public class Volatile extends Thread {

	private volatile int num;

	public Volatile() {
		num=0;
	}
	 public void print()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+num++);
		}
	}
	
	
}
