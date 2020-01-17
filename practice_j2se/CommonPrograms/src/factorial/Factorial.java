package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter num");
			int n =sc.nextInt();
			
			if(n==0||n==1)
			{
				System.out.println(1);
			}
			else
			{
				int t=n;
				while(n>1)
				{
					t=t*--n;
					
				}
				System.out.println(t);
			}
		}
	}
}
