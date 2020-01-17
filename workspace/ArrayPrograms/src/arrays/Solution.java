package arrays;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        int sum,count=0,k=0;
        while(k<n)
        {
            for(int i=0;i<n;i++)
            {
                sum=0;
                for(int j=k;j<=i;j++)
                {
                    sum+=a[j];
                }
                if(sum<0)
                    count++;
            }
            k++;
        }
        
        System.out.println(count);
    }
}

