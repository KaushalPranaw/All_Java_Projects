package doubleColonOperator;

public class TestMethodReferences {

	
	public static void main(String[] args) {
		
		Runnable runnable=()->{
			
			for(int i=1;i<=10;i++)
			{
				System.out.println("child thread");
			}
		};
		Thread thread=new Thread(runnable);
		thread.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("main thread");
		}
	}
	
}
