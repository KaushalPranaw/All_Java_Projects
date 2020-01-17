package com.app.core;

public class JoinDemo2 extends Thread {

	private Thread thread;

	@Override
	public void run() {
		if(thread==null)
		{
			thread=new Thread(this);
			thread.start();
		}
		try {
			thread.join(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (int i = 1; i <= 2; i++) {
			
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
