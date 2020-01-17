package com.app.lambda;

import java.util.ArrayList;
import java.util.List;

public class TestClass  {
	
	public static void main(String[] args) {
		TestInterface t=new TestInterface() {
			
			@Override
			public void square(int a) {
				// TODO Auto-generated method stub
				System.out.println(a*a);
			}

			 
		};
		t.square(6);
		
		TestInterface t1=(a)->{System.out.println(a*a);};
		t1.square(10);
		
		
		List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
        list.forEach(System.out::println);
        
        list.forEach((n)->System.out.println(n));
	}
	
}
