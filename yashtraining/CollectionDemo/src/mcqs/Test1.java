package mcqs;

public class Test1 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run");
	}
	
	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		System.out.println("start");
		super.start();
	}
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.start();
	}
}
