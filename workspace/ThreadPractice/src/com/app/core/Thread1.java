package com.app.core;

public class Thread1 extends Thread{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			System.out.println("thread is running");
		}
		
		public static void main(String[] args) {
			Thread1 t1=new Thread1();
			t1.start();
		}
	
}
