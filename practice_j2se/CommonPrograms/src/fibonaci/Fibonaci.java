package fibonaci;

import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = 0;
			int b = 1;
			System.out.println("How many numbers do u want ?");
			int n = sc.nextInt();
			System.out.println(a);
			System.out.println(b);
			while (n >= 2) {
				int c = a + b;
				System.out.println(c);
				a = b;
				b = c;
				n--;
			}
		}
	}
}
