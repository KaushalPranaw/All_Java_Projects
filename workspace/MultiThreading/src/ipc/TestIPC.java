package ipc;

public class TestIPC {
	public static void main(String[] args) throws InterruptedException {
		IPCDemo target=new IPCDemo();
		Thread thread=new Thread(target);
		thread.start();
		
		synchronized (target) {
			System.out.println("main calling wait method");//step 1
			target.wait();
			System.out.println("main got notification");//step 4
			System.out.println(target.total);
		}
	}
}
