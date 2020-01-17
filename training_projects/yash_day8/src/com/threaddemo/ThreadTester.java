package com.threaddemo;

public class ThreadTester extends Thread {

	
	public static void main(String[] args) {
		MyRunnable target=new MyRunnable();
		Thread thread1=new Thread(target,"ONE");
		
		MyRunnable target1=new MyRunnable();
		Thread thread2=new Thread(target1,"TWO");
		thread1.start();
		thread2.start();
	}
}
