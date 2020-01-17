package com.threaddemo;

public class MyRunnable2 extends Thread {

	int num;
	public MyRunnable2() {
		num=1;
	}
	/*@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Running");
		printNum();
		printNum1();
		System.out.println(Thread.currentThread().getName()+" Dead");
	}*/
	/*void printNum()
	{
		for(int i=1;i<11;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+num++);
		}
	}*/
	synchronized void printNum()
	{
		for(int i=1;i<11;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+num++);
		}
	}
	synchronized void printNum1()
	{
		for(int i=1;i<11;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+num++);
		}
	}
}
