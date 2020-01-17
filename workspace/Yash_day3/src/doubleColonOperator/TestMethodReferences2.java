package doubleColonOperator;

public class TestMethodReferences2 {

	public static void m1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("child thread");
		}
	}
	
	public static void main(String[] args) {
		
		Runnable runnable= TestMethodReferences2::m1;
		Thread thread=new Thread(runnable);
		thread.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("main thread");
		}
	}
	
}
