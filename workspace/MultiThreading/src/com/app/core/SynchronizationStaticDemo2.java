package com.app.core;

public class SynchronizationStaticDemo2 extends Thread {

	 

	public SynchronizationStaticDemo2() {
		 
	}

	@Override
	public void run() {
		SynchronizationStaticDemo2.display(5);
	}

	// Now check with following
	static void display(int num) {
		 
			synchronized (SynchronizationStaticDemo2.class) {
				for (int i = 1; i <= 10; i++) {
					System.out.println(Thread.currentThread().getName() + " : " + (num*i));
				}
			}
		System.out.println();
		}

	 
}
