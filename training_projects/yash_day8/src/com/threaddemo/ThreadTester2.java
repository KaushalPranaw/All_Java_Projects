package com.threaddemo;

public class ThreadTester2 extends Thread {

	
	public static void main(String[] args) {
		MyRunnable2 target=new MyRunnable2();
		Thread thread1=new Thread(target,"ONE");
		
		 
		Thread thread2=new Thread(target,"TWO");
		thread1.start();
		thread2.start();
	}
}
