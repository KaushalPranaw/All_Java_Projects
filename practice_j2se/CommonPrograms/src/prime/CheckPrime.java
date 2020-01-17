package prime;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter number to check prime ");
			int n = sc.nextInt();
			int c = 0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
					c++;
			}
			if(c==2)
				System.out.println("prime");
			else
			{
				System.out.println("not prime");
			}
		}
	}
}
