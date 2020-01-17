import java.util.Scanner;

public class IntToBin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int i=0;
		int a[];
		a=new int[10];
		while(num!=0)
		{
			int rem=num%2;
			a[i++]=rem; 
			num=num/2;
		}
		
		
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(a[j]+" ");
		}
	}
}
