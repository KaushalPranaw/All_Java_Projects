package mcqs;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Test {

	    
	        public static void main(String args[]) throws InterruptedException
	        {
	        	synchronized (args) {
					System.out.println("1");
					args.wait();
					System.out.println("2");
				}
	            Thread t = Thread.currentThread();
	            t.setName("New Thread");
	            System.out.println(t);        
	        }
	    
}
