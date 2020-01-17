package arrays.chaos;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        String sp[]=s.split("[ !,?._'@]+");
	        System.out.println(Arrays.toString(sp));
	        scan.close();
	    }
}