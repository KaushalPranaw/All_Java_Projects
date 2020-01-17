package test;

import com.app.core.Demo1;

public class Tester {

	public static void main(String[] args) {
		/*System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().availableProcessors());
		 		*/
		Thread.currentThread().setPriority(10);
		/* System.out.println(Thread.currentThread().getName());
		 Thread.currentThread().setName("pranaw");
		 System.out.println(Thread.currentThread().getName());*/
		Demo1 d=new Demo1();
		/*Thread t=new Thread(d);*/
		d.start();
	/*	d.start();*/ //IllegalThreadStateException
		/*try {
			d.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		//Thread.currentThread().yield();
		/*System.out.println(t.getName());
		System.out.println(t.getPriority());*/
		 for(int i=1;i<=100;i++)
		 {
			 System.out.println("main "+i);
			/* try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		 }
	}
}
