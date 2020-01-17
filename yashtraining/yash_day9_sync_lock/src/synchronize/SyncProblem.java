package synchronize;

public class SyncProblem extends Thread {

	synchronized void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("print() :: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		print1();
	}

	void print1() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("print1() :: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		print();
	}
}
