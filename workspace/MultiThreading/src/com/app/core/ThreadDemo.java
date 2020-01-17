package com.app.core;

public class ThreadDemo extends Thread {

	private String threadName;
	private Thread thread;
	public ThreadDemo(String threadName) {
		this.threadName=threadName;
		System.out.println("Creating : "+threadName);
	}
	@Override
	public void run() {
		System.out.println("Running : "+threadName);
		System.out.println(thread.getState());
		
		for(int i=0;i<40;i++)
		{
			System.out.println(threadName+" : "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(thread.getState());
				System.out.println(threadName+" "+"interrupted");
			}
			
		}
		System.out.println("Exiting : "+threadName);
	}
	@Override
	public synchronized void start() {
		System.out.println("Ready to run : "+threadName);
		
		if(thread==null)
		{
			thread=new Thread(this, threadName);
			thread.start();
		}
		System.out.println(thread.getState());
	}
	
	
	public static void main(String[] args) {
		ThreadDemo threadDemo=new ThreadDemo("Thread-1");
		
		System.out.println(threadDemo.getState());
		threadDemo.start();
		for(int i=0;i<50;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
			System.out.println(Thread.currentThread().getState());
			System.out.println(threadDemo.getState());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getState());
				System.out.println(Thread.currentThread()+" "+"interrupted");
			}
		}
	}
	
}
