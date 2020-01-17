package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter pos");
		int pos = sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[(i+pos)%arr.length]);
		}
		
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[(i+pos)%arr.length]);
		}*/
		
		
	/*	int ra[] = new int[arr.length];
		int k=0;
		for(int i=pos;i<arr.length;i++)
		{
			ra[k++]=arr[i];
		}
		for(int i=0;i<pos;i++)
		{
			ra[k++]=arr[i];
			
		}
		System.out.println(Arrays.toString(ra));*/
				
	}
}
