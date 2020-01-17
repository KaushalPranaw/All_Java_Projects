package synchronize;

public class Account extends Thread {

	private long balance;
	
	public Account() {
		balance=50000;
	}
	
	synchronized void deposit(long rupee) throws InterruptedException
	{
		display();
		//notify();
		wait(2000);
		balance += rupee; 
		System.out.println(Thread.currentThread().getName()+" "+"balance after deposit : "+balance);
		notify();
	}
	synchronized void withdraw(long rupee) throws InterruptedException
	{
		display();
		//notify();
		
		balance -= rupee;
		wait(2000);
		System.out.println(Thread.currentThread().getName()+" "+"balance after deposit : "+balance);
		notify();
	}
	
	void display()
	{
		System.out.print(Thread.currentThread().getName()+" ");
		System.out.println("current balance : "+balance);
	}
}
