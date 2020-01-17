package synchronize;

public class AtmTester {

	public static void main(String[] args) {
		Account account = new Account(2000);
		Thread thread1 = new Thread(account, "Husband") {
			@Override
			public void run() {
				account.deposit(1000);
				// account.withdraw(200);
			}
		};

		Thread thread2 = new Thread(account, "Wife") {
			@Override
			public void run() {
				//account.deposit(2000);
				account.withdraw(1000);
			}
		};
		try {
			thread2.join(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		thread1.start();
		thread2.start();
	}
}
