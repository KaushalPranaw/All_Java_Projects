package com.app.tester;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		/*String s=null;
		System.out.println(s.charAt(0));*/
		
		int a=10;
		int b=0;
		try
		{
			int c=10/0;
			System.out.println(c);
		}
		/*catch(IOException e)
		{
			System.out.println(e);
		}*/
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			//System.exit(1500);
			System.out.println("finally");
		}
		System.out.println("rest of the code");
	}
}
