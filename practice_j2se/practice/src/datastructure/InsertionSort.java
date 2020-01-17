package datastructure;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int a[]={2,5,1,3,7};
		int j,key;
		for(int i=1;i<a.length;i++)
		{
			j=i-1;
			key=a[i];
			while(j>=0&&a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		System.out.println(Arrays.toString(a));
	}
}
