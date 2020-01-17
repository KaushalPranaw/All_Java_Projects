package synchronize;

public class TestSyncProblem {

	public static void main(String[] args) {
		SyncProblem target=new SyncProblem();
		Thread thread1=new Thread(target,"One");
		thread1.start();
		
	}
}
