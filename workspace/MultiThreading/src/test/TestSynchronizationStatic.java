package test;
 
import com.app.core.SynchronizationStaticDemo;

public class TestSynchronizationStatic {

	public static void main(String[] args) {
		SynchronizationStaticDemo target=new SynchronizationStaticDemo();
		Thread thread=new Thread(target, "Child-1");
		
		Thread thread2=new Thread(target, "Child-2");
		thread.start();
		thread2.start();
	}
}
