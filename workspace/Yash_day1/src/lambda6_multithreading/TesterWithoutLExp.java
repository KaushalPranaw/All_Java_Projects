package lambda6_multithreading;

public class TesterWithoutLExp {

	public static void main(String[] args) {
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("main");
		}
	}
}
