package synchronize;

public class Account extends Thread {

	private long balance,counter=1;
	private long min;
	//private int counter=1;
	public Account(long balance) {
		this.balance = balance;
		min=1000;
	}

	synchronized void deposit(long money) {
		
		System.out.println(Thread.currentThread().getName());
		Thread.getAllStackTraces().keySet().forEach(System.out::println);
		//System.out.println(Thread.getAllStackTraces().keySet().size());
		if(Thread.currentThread().getName().equals("Wife")&&Thread.getAllStackTraces().keySet().size()>6)
		{
			try {
				wait();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(Thread.currentThread().getName()+" :: Current Balance : " + balance);
		balance += money;
		System.out.println(Thread.currentThread().getName()+" :: Balance After deposit "+money+": " + balance);
		notify();
		
	}

	synchronized void withdraw(long money) {
		
		System.out.println(Thread.currentThread().getName()+" :: Current Balance : " + balance);
		if(balance-money<1500)
		{
			System.out.println(Thread.currentThread().getName()+" :: balace can't be less than 1500. Your current balace is : "+ balance);;
		}
		else
		{
			balance -= money;
			System.out.println(Thread.currentThread().getName()+" :: Balance After withdraw "+money+" :  " + balance);
		}
		
	}
}
