package lock;

public class ATMDemo extends Account {

	public static void main(String[] args) {
		Account account=new Account();
		
		Thread thread1=new Thread(account,"Husband")
		{
					public void run() {
						 
						account.deposit(1000);
					//	account.withdraw(100);
					}
		};
		Thread thread2=new Thread(account,"Wife")
		{
					public void run() {
						 
						account.deposit(2000);
						//account.withdraw(200);
					}
		};
		thread1.start();
		thread2.start();
		
	}
	
}
