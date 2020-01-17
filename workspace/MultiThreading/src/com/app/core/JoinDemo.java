package com.app.core;

public class JoinDemo implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println("child");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
}
