package lock2;

import lock.MyRunnable;

public class TesterLock {

	public static void main(String[] args) {
		MyRunnable target=new MyRunnable();
		Thread thread1=new Thread(target, "one");
		Thread thread2=new Thread(target, "two");
		thread1.start();
		thread2.start();
	}
}
