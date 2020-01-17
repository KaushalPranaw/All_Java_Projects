package com.threaddemo;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Running");
		if(Thread.currentThread().getName().equals("ONE"))
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("Thread "+Thread.currentThread().getName()+" "+i );
			}
		}
		if(Thread.currentThread().getName().equals("TWO"))
		{
			for(char i='a';i<='z';i++)
			{
				System.out.println("Thread "+Thread.currentThread().getName()+" "+i );
			}
		}
		System.out.println(Thread.currentThread().getName()+" Dead");
	}

	
}
