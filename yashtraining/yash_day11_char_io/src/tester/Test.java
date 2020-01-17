package tester;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
public class Test 
{
	static String s="";
	public static void main(String[] args) {
		try {
			s+="a";
			
			throw new Exception();
		}
		catch (Exception e) {
			// TODO: handle exception
			s+="b";
		}
		finally {
			s+="c";
			try
			{
				m();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			s+="d";
		}
		System.out.println(s);
	}
	static void m()
	{
		throw new NullPointerException(); 
	}
}