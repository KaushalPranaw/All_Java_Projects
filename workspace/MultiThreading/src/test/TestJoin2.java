package test;

import com.app.core.JoinDemo2;

public class TestJoin2 {

	public static void main(String[] args) throws InterruptedException {
		/*Thread.currentThread().join(3000);*///isse nahi chlega
		JoinDemo2 joinDemo=new JoinDemo2();
		Thread thread=new Thread(joinDemo,"Thread Child");
		thread.start();
		 
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
