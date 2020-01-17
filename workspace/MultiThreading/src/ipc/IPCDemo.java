package ipc;

public class IPCDemo extends Thread {


	int total=0;
	
	@Override
	public void run() {
		 synchronized (this) {
			System.out.println("Child start calculation");//step 2
			for(int i=1;i<=100;i++)
			{
				total+=i;
			}
			System.out.println("After calculation");//step 3
			this.notify();
		}
	}
}
