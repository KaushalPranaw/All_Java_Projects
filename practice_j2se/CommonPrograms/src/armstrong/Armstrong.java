package armstrong;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter num");
			int n = sc.nextInt();
			int t = n;
			int sum = 0;
			int s = String.valueOf(n).length();
			while (n > 0) {
				int l = n % 10;
				sum = sum + (int) (Math.pow(l, s));
				n = n / 10;
			}
			if (t == sum)
				System.out.println("armstrong");
			else
				System.out.println("not");
		}
	}
}
