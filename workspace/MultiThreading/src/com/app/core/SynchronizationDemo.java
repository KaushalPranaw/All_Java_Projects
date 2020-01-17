package com.app.core;

public class SynchronizationDemo extends Thread {

	private int num;

	public SynchronizationDemo() {
		num = 1;
	}

	@Override
	public void run() {
		display();
	}

	// First check with this
	/*
	 * void display() { for(int i=1;i<=10;i++) {
	 * System.out.println(Thread.currentThread().getName()+" : "+num++); } }
	 */

	// Now check with following
	synchronized void display() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + num++);
		}
	}
}
