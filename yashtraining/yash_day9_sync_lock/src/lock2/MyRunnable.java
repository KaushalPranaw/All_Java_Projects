package lock2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable {

	final Lock lock = new ReentrantLock();
	final Condition condition = lock.newCondition();

	public MyRunnable() {
		// TODO Auto-generated constructor stub
	}

	void print() {
		lock.lock();
		try {
			for (int i = 1; i <= 10; i++) {

				if (i == 5 && Thread.currentThread().getName().equals("one")) {
					condition.await();
				}
				
			}
			condition.signal();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			lock.unlock();
		}
	}

	@Override
	public void run() {
		print();

	}
}
