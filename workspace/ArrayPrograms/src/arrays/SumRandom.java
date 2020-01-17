package arrays;

import java.util.Scanner;

public class SumRandom {

	public static void main(String[] args) {
		int a[]=new int[]{10,2,2,2,2,3,3,4,5,6,6};
		int size=a.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter position to get sum");
		int n=sc.nextInt();
		int sum=summation(a,size,n);
		System.out.println("sum = "+sum);
	}
	
	static int summation(int a[],int size,int n)
	{
		int sum=0;
		if(n<size)
		{
				for(int i=0;i<n;i++)
				{
					sum+=a[i];
				}
		}
		else
		{
			System.out.println("wrong pos");
		}
		return sum;
	}
}
