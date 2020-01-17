package test;

import com.app.core.JoinDemo;

public class TestJoin {

	public static void main(String[] args) {
		JoinDemo joinDemo=new JoinDemo();
		Thread thread=new Thread(joinDemo);
		thread.start();
		try {
			thread.join(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<=10;i++)
		{
			System.out.println("main");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
