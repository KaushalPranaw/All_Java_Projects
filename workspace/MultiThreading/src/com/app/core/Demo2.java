package com.app.core;

public class Demo2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println("child "+i);
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("interupted");
			}*/
		}
	}
}
