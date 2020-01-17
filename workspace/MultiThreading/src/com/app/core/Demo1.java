package com.app.core;

public class Demo1 extends Thread {

	static Thread t;
	@Override
	public void run() {
		/*try {
			t.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		Thread.currentThread().setPriority(1);
		for(int i=1;i<=50;i++)
		{
			
			System.out.println("child "+i);
			/*try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	}
	/*public void start() {
		for(int i=1;i<=10;i++)
		{
			System.out.println("start 1");
		}
	}*/
	/*public void run(int a) {
		for(int i=1;i<=10;i++)
		{
			System.out.println("child 2");
		}
	}
*/	
	
}