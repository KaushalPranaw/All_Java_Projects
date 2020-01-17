package lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable extends Thread {

	private Lock lock;
	private Condition condition;

	/*
	 * Lock interface uses internally synchronization so no need to write
	 * synchronized keyword here It has lock() and unlock() method If we apply
	 * lock() on single thread then it will unlock() automatically because we have
	 * written unlock() method It itself lock and unlock not depend on other to
	 * unlock them
	 */
	private int num;

	public MyRunnable() {
		lock = new ReentrantLock();
		condition = lock.newCondition();
		num = 1;
	}
	// First try this
	
	 /* void print() 
	  { 
		  lock.lock(); 
		  for(int i=1;i<=10;i++) 
		  {
			  System.out.println(Thread.currentThread().getName()+" :: "+num++);
		  } 
		  //notify(); 
		  lock.unlock(); 
	  }*/
	 

	// Now if we want to apply wait and notify condition here
	/*
	 * If another interface comes that is Condition Condition interface has await()
	 * and signal() method thus by calling this method we can unlock the thread in
	 * between
	 */

	void print() {
		lock.lock();
		for (int i = 1; i <= 10; i++) {

			System.out.println(Thread.currentThread().getName() + " :: " + num++);

			if (Thread.currentThread().getName().equals("ONE")&&Thread.getAllStackTraces().keySet().size()>6) {
				if (i == 5)
					try {
						condition.await();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}

		}
		condition.signal();
		lock.unlock();
	}

	@Override
	public void run() {
		print();
	}

}
