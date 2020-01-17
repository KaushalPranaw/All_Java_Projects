package lambda9; 

public class Test {
	
	public static void main(String[] args) {
		/* //annonymous
		Runnable r=new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1;i<=10;i++)
				{
					System.out.println("child");
				}
			}
			
			 
		};
		*/
		Runnable r1=()->
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("child");
			} 
		};
		
		Thread t=new Thread(r1);
		t.start();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("main");
		}
		
	}

}
