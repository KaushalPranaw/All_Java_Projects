package doubleColonOperator;

public class TestMethodReferences4 {
	
	//in method refrenece we have to worry only about argument nothing else (return type or modifire does not matter same or differnent)

	public  void m1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("child thread");
		}
	}
	//or
		
	/*private  void m1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("child thread");
		}
	}*/
	
	
	//or
	/*public  int m1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("child thread");
		}
		return 10;
	}*/
	
	/*public  int m1(int a) // ab error ayegi bcz public void run() se match krta hai ye
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("child thread");
		}
		return 10;
	}*/
	
	public static void main(String[] args) {
		
		TestMethodReferences4 test=new TestMethodReferences4();
		Runnable runnable= test::m1;
		Thread thread=new Thread(runnable);
		thread.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("main thread");
		}
	}
	
}
