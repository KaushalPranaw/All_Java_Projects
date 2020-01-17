package com.app.core;

public class SynchronizationDemo2 extends Thread {

	private int num;

	public SynchronizationDemo2() {
		num = 1;
	}

	@Override
	public void run() {
		display();
	}

	// Now check with following
	void display() {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + num++);
			}
		}

	}
}
