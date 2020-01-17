package doubleColonOperator;

public class TestMethodReferences3 {

	public  void m1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("child thread");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		TestMethodReferences3 test=new TestMethodReferences3();
		Runnable runnable= test::m1;
		Thread thread=new Thread(runnable);
		thread.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("main thread");
		}
	}
	
}
