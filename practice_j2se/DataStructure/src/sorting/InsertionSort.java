package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int a[] = new int[] { 1, 3, 31, 2, 5, 3, 29 };
		System.out.println("Before :"+" "+Arrays.toString(a));
		insertionSort(a);
		System.out.println("After  :"+" "+Arrays.toString(a));
	}

	private static void insertionSort(int[] a) {
		int j;
		for(int i=1;i<a.length;i++)
		{
			j=i-1;
			int k=a[i];
			while(j>=0&&a[j]>k)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=k;
		}
		
	}
}
