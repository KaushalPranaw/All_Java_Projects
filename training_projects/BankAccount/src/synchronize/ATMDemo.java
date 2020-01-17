package synchronize;

public class ATMDemo extends Account {

	public static void main(String[] args)throws InterruptedException {
		Account account=new Account();
		
		Thread thread1=new Thread(account,"Husband")
		{
					public void run() {
						 
						try {
							account.withdraw(40000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						//account.withdraw(100);
					}
		};
		Thread thread2=new Thread(account,"Wife")
		{
					public void run() {
						 
						try {
							account.withdraw(500000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//account.withdraw(200);
					}
		};
		thread1.start();
		thread2.start();
		
	}
	
}
