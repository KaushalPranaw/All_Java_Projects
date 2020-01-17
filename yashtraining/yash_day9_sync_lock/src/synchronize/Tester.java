package synchronize;

public class Tester extends Thread {

	public static void main(String[] args) {
		//To check number of thread is running at a time
		Thread.getAllStackTraces().keySet().forEach(System.out::println);
	}
}
