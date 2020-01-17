package datastructure;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int temp;
		boolean flag=false;
		int [] arr={-3,4,2,8,3,5,9};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					flag=true;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(!flag)
			{
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	

	/*rivate static void swap(int i, int j) {
		int temp;
		temp=i;
		i=j;
		j=temp;
		
	}*/
}
