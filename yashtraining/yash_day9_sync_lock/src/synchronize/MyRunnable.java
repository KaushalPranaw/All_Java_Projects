package synchronize;

public class MyRunnable extends Thread {

	private int num;
	
	public MyRunnable() {
		num=1;
	}
	//problem  in synchronization in wait and notify is this
	/*
	 * If we are calling Thread One first then
	 * it will stop thread one after 5 because thread TWO is remaining.
	 * But in case thread scheduler call thread TWO first
	 * then thread two will complete their execution without any waiting condition
	 * and call thread One it will stop at i==5
	 * but will never resume again because there is no remaining thread.
	 * Thus problem of deadlock coming here
	 * Solution is Lock
	 * Lock interface has--------->
	 * 	lock() and unlock() method
	 * It uses Reentrant implementation class
	 * Thus it call lock() and unlock() method 
	 * Now see Lock example
	 * */
	synchronized void print()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" :: "+num++);
			
			if(Thread.currentThread().getName().equals("ONE"))
			{
				if(i==5)
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			
		}
		notify();
	}
	
	@Override
	public void run() {
		print();
	}
	
}
