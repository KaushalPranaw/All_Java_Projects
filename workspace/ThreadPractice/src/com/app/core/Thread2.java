package com.app.core;

public class Thread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread using runnable ");
	}
	public static void main(String[] args) {
		Thread2 t2=new Thread2();
		Thread t=new Thread(t2);
		t.start();
	}
}

