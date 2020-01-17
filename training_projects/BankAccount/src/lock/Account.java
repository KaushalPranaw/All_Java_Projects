package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account extends Thread {

	private long balance;
	private Lock lock;
	public Account() {
		balance=50000;
		lock = new ReentrantLock();
	}
	
	 void deposit(long rupee)
	{
		lock.lock();
		display();
		balance += rupee; 
		System.out.println("balance after deposit : "+balance);
		lock.unlock();
	}
	void withdraw(long rupee)
	{
		lock.lock();
		display();
		balance -= rupee;
		System.out.println("balance after deposit : "+balance);
		lock.unlock();
	}
	
	void display()
	{
		System.out.print(Thread.currentThread().getName()+" ");
		System.out.println("current balance : "+balance);
	}
}
