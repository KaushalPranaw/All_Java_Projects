package com.appp; 


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long max=1;
            for(int i=1;i<=n;i++)
            {
                if(new BigInteger(String.valueOf(i)).isProbablePrime(i))
                {
                    if(n%i==0)
                    {
                        if(max<i)
                            max=i;
                    }
                }
                
            }
            System.out.println(max);
        }
    }
}

