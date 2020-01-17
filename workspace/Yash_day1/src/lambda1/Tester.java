package lambda1;

public class Tester {
	public static void main(String[] args) {
		TestFI t = () -> System.out.println("hello by LE"); // no need to write implementation class
		t.m1();
	}
}
