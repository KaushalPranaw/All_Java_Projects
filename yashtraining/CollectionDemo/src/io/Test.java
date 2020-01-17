package io;


public class Test {
	static String s="a";
	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println(s);
	}
	static void m1() throws Exception
	{
		s+="b";
		m2();
	}
	static void m2() throws Exception 
	{
		s+="c";
		
			m3();
		
		s+="e";
		
	}
	static void m3() throws Exception
	{
		s+="d";
		throw new Exception();
		//s+="d1";
	}
	
}
