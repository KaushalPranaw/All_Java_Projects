package test;

import com.app.core.Demo2;

public class Tester2  {

	public static void main(String[] args) {
		Demo2 d=new Demo2();
		//Thread t1=new Thread();
		Thread t=new Thread(d);
		//t.start();
		t.start();
		t.interrupt();
		for(int i=1;i<=10;i++)
		{
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			System.out.println("main "+i);
		}
	}
}
