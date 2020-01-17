package core;

import java.io.IOException;

public class TestRuntime {

	public static void main(String[] args) {
		System.out.println("Free Memory : "+Runtime.getRuntime().freeMemory());
		
		System.out.println("Total Memory : "+Runtime.getRuntime().totalMemory());
		
		System.out.println("Open Chrome");
		try {
			 Process process = Runtime.getRuntime().exec("google-chrome"); 
	         
			 System.out.println("Google Chrome successfully started"); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
