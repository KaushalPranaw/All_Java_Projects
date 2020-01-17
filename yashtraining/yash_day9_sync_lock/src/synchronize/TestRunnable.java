package synchronize;

public class TestRunnable {
	public static void main(String[] args) {
			MyRunnable target=new MyRunnable();
			Thread thread1=new Thread(target, "ONE");
			Thread thread2=new Thread(target, "TWO");
			thread1.start();
			thread2.start();
	}
}
