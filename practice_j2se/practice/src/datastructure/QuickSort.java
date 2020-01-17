package datastructure;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int a[]={10,7,8,6,1,5};
		
		quicksort(a,0,a.length-1);
		
		System.out.println(Arrays.toString(a));
	}

	private static void quicksort(int[] a, int l, int r) {
		if(l<r)
		{
			int pivot=partition(a,l,r);
			quicksort(a, l, pivot-1);
			quicksort(a, pivot+1, r);
		}
		
	}

	private static int partition(int[] a, int l, int r) {
		int pivot=a[r];
		int i=l-1;
		for(int j=l;j<r;j++)
		{
			if(a[j]<pivot)
			{
				i++;
				int tmp=a[i];
				a[i]=a[j];
				a[j]=tmp;
			}
		}
		
		int tmp=a[i+1];
		a[i+1]=a[r];
		a[r]=tmp;
		
		
		
		return i+1;
	}
}
