package tester;

import java.util.Arrays;
import java.util.Random;

public class TestParallel {

	public static void main(String[] args) {
		int arr[]=new int[100000000];
		int j=0;
		Random r=new Random();
		for(int i:arr)
		{
			i=r.nextInt();
		}
		check(arr);
		for(int i:arr)
		{
			i=r.nextInt();
		}
		check1(arr);
				
		
	}
	
	static void check(int arr[])
	{
		
		long start=System.currentTimeMillis();
		Arrays.sort(arr);
		long end=System.currentTimeMillis();
		System.out.println(end-start);

	}
	static void check1(int arr[])
	{
		long start1=System.currentTimeMillis();
		Arrays.parallelSort(arr);
		long end1=System.currentTimeMillis();
		System.out.println(end1-start1);

	}
}
