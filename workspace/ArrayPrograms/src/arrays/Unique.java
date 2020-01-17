package arrays;

import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Unique elements are:");
		for(int i=0;i<a.length;i++)
		{
			int j;
			for(j=0;j<i;j++)
				if(a[i]==a[j])
					break;
			if(i==j)
				System.out.print(a[i]+" ");
		}
		
	}
}
