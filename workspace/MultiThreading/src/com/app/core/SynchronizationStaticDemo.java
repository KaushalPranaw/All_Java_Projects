package com.app.core;

public class SynchronizationStaticDemo extends Thread {

	 

	public SynchronizationStaticDemo() {
		 
	}

	@Override
	public void run() {
		SynchronizationStaticDemo.display(5);
	}

	// Now check with following
	static void display(int num) {
		 
			for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (num*i));
		}
		System.out.println();
		}

	/*//Now check
	synchronized static void display(int num) {
		 
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (num*i));
		}
		System.out.println();
	}*/
}
