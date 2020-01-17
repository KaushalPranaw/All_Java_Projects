package com.app.tester;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.app.core.Customer;

public class TesterRead {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("./src/file.ser"));
		Customer c=(Customer) ois.readObject();
		
		System.out.println(c);
	}
	
}
