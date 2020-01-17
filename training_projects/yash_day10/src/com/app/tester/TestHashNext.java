package com.app.tester;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.app.core.Customer;

public class TestHashNext {

	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int id = 0;
		String name="";
		double salary=0.0;
		
			System.out.println("Enter id");
			while(!scanner.hasNextInt())
			{	
				
				System.out.println("Enter id");
				//while(scanner.next().equals("\n"));
				scanner.nextLine();
					
			}
			id = scanner.nextInt();
			System.out.println("Enter name ");
			name = scanner.next();
			System.out.println("Enter sal");
			while(!scanner.hasNextDouble())
			{	
				System.out.println("Enter sal");
				scanner.next();
					
			}
			salary = scanner.nextDouble();
			
		
		Customer customer = new Customer(id, name, salary);
		System.out.println(customer);
		
		if (scanner != null)
			scanner.close();
	}
}
