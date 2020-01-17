package prime;

import java.util.Scanner;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("till what");
			int n = sc.nextInt();
			int c=0;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						c++;
					}
				}
				if(c==2)
					System.out.println(i);
				c=0;
			}
			
		}
	}
}
