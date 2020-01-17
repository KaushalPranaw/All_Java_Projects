package mcqs;


class A implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stu
		if(Thread.currentThread().getName().equals("Thread-1"))
			m1();
		else
			m2();
	}
	 synchronized void m1()
	{
		System.out.println(Thread.currentThread().getName()+" started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" ended");
	}
	 synchronized  void m2()
	{
		System.out.println(Thread.currentThread().getName()+" started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" ended");
	}
	
}
public class TestThread {

	public static void main(String[] args) throws Exception {
		A a =new A();
		A b =new A();
		Thread t1=new Thread(a, "Thread-1");
		Thread t2=new Thread(b, "Thread-2");
		t1.start();
		Thread.sleep(10);
		t2.start();
		
	}
}
