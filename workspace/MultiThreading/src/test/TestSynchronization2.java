package test;

import com.app.core.SynchronizationDemo2;

public class TestSynchronization2 {

	public static void main(String[] args) {
		SynchronizationDemo2 target=new SynchronizationDemo2();
		Thread thread=new Thread(target, "Child-1");
		
		Thread thread2=new Thread(target, "Child-2");
		thread.start();
		thread2.start();
	}
}
