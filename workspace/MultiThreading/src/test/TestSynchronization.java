package test;

import com.app.core.SynchronizationDemo;

public class TestSynchronization {

	public static void main(String[] args) {
		SynchronizationDemo target=new SynchronizationDemo();
		Thread thread=new Thread(target, "Child-1");
		
		Thread thread2=new Thread(target, "Child-2");
		thread.start();
		thread2.start();
	}
}
