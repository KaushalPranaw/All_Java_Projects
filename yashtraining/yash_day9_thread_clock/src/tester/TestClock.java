package tester;

import java.util.Calendar;
import java.util.Date;

public class TestClock {

	public static void main(String[] args) {
		Thread thread1 = new Thread("Clock") {

			@Override
			public void run() {
				Calendar calendar = Calendar.getInstance();
				int hour = calendar.get(Calendar.HOUR_OF_DAY);
				int min = calendar.get(Calendar.MINUTE);
				int sec = calendar.get(Calendar.SECOND);
				
				while(sec<60)
				{
					
					System.out.println(sec);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sec++;
				}
			}

		};
		
		thread1.start();
	}
}
