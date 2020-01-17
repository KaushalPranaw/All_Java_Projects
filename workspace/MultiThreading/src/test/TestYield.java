package test;
 
import com.app.core.YieldDemo;

public class TestYield {

	public static void main(String[] args) {
		YieldDemo target=new YieldDemo();
		Thread thread=new Thread(target);
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
