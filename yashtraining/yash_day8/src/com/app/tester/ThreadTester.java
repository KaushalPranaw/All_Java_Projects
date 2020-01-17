package com.app.tester;

class Parent extends Thread {
	private Thread thread;
	private String threadName;

	public Parent(String threadName) {
		this.threadName = threadName;
		System.out.println("Creating " + threadName);
	}

	@Override
	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Thread : " + threadName + " ," + i);
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread : " + threadName + " interrupted");
		}
		System.out.println("Exiting : " + threadName + " ");
	}

	@Override
	public synchronized void start() {
		System.out.println("Ready to run : " + threadName);
		if (thread == null) {
			thread = new Thread(this, threadName);
			thread.start();
		}
	}
}

public class ThreadTester {

	public static void main(String[] args) {
		Parent parent = new Parent("Thread-1");
		parent.start();
	}
}
