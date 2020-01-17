package palindrme;

import java.util.Scanner;

public class Palindrme {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter num to check palindrome");
			int n = sc.nextInt();
			int t=n;
			int r = 0;
			while (n > 0) {
				int l = n % 10;
				r = (r * 10) + l;
				n = n / 10;
			}
			if (t == r)
				System.out.println("palindrome ");
			else
				System.out.println("not");
		}
	}
}
