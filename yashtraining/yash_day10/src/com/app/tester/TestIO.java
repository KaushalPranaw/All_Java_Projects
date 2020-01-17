package com.app.tester;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.app.core.Customer;

public class TestIO {

	public static void main(String[] args) throws FileNotFoundException, IOException  {
		Scanner scanner = new Scanner(System.in);
		int id = 0;
		String name="";
		double salary=0.0;
		boolean exit=true;
		//System.out.println("Enter id name salary");
			while(exit)
			{	
				try {
					System.out.println("Enter id");
					id = scanner.nextInt();
					exit=false;
				} catch (InputMismatchException e) {
					System.out.println("id should be int type\n");
					//exit=true;
					scanner.nextLine();
					 
					
				}
			}
			System.out.println("Enter name ");
			name = scanner.next();
			exit=true;
			while(exit)
			{	
				try {
					System.out.println("Enter salary ");
					salary = scanner.nextDouble();
					exit=false;
				} catch (InputMismatchException e) {
					System.out.println("salary should be double type");
					exit=true;
					scanner.nextLine();
					 
				}
			}
			  
		
		
		Customer customer = new Customer(id, name, salary);
		System.out.println(customer);
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("./src/file.ser"));
		oos.writeObject(customer);
		if (scanner != null)
			scanner.close();
	}
}
