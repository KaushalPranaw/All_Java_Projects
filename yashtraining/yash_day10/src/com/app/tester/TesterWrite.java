package com.app.tester;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.app.core.Customer;

public class TesterWrite {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("./src/file.ser"));
		Customer c=new Customer(1, "abc", 100);
		
		System.out.println(c);
		oos.writeObject(c);;
	}
	
}
