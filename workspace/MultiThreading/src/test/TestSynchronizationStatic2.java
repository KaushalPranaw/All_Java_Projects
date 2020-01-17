package test;
 
import com.app.core.SynchronizationStaticDemo2;

public class TestSynchronizationStatic2 {

	public static void main(String[] args) {
		SynchronizationStaticDemo2 target=new SynchronizationStaticDemo2();
		Thread thread=new Thread(target, "Child-1");
		
		Thread thread2=new Thread(target, "Child-2");
		thread.start();
		thread2.start();
	}
}
