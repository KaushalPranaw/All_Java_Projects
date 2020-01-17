package factorial;

import java.util.Scanner;

public class RecursiveFactorial {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter num");
			int n = sc.nextInt();
			if (n < 0) {
				System.out.println("can't be negative");
			} else {
				System.out.println(getFact(n));
			}

		}
	}

	static int getFact(int n) {

		if (n == 0 || n == 1) {
			return 1;
		} else
			return n * getFact(n - 1);
	}
}
