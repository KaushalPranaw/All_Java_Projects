package com.app;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
    	List<Integer> a=Arrays.stream(arr)	 
								.boxed()  		 
								.collect(Collectors.toList());;
    	ArrayList<Integer> b=new ArrayList<>();
         //min
    	int m=min(a);
    	while(m!=0)
    	{
    		int count=0;
    		for(int i:a)
    		{
    			i=i-m;
    			count++;
    		}
    		//System.out.println(count);
    		b.add(count);
    		for(int i:a)
    		{
    			if(a.get(i)==0)
    				a.remove(i);
    		}
    		
    		m=min(a);
    		System.out.println(m);
    	}
    	
    	int c[]=new int[b.size()];
    	for(int i=0;i<b.size();i++)
    		c[i]=b.get(i);
    	return c;
    }
    static int min(List<Integer> a)
    {
    	Collections.sort(a);
    	System.out.println(a.size());
    	int min=a.get(0);
    	 
    	return min;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
          System.out.println(result[i]);
        }

       
        scanner.close();
    }
}
