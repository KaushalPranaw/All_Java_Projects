package com.threaddemo;

public class ThreadTester2 extends Thread {

	
	public static void main(String[] args) {
		MyRunnable2 target=new MyRunnable2();
		Thread thread1=new Thread(target,"ONE")
				{
					@Override
					public void run() {
						target.printNum();
					}
				};
		
		 
		Thread thread2=new Thread(target,"TWO")
		{
			@Override
			public void run() {
				target.printNum1();
			}
		};
		thread1.start();
		thread2.start();
	}
}
