package lambda6_multithreading;

public class TesterWithLE {

	public static void main(String[] args) {
		 Runnable r=()->{
			for(int i=1;i<=10;i++)
			{
				System.out.println("child 1 ");
			}
		 };
		Thread t=new Thread(r);
		t.start();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("main 1");
		}
	}
}
