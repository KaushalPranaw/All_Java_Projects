package com.app.tester;

import java.util.Scanner;

import com.app.core.Employee;
import com.app.core.Student;

public class Tester1 {

	public static void main(String[] args) {
		 try(Scanner scanner =new Scanner(System.in))
		 {
			 System.out.println("Enter no of emp");
			 int noOfEmp=scanner.nextInt();
			 Object[][] obj=new Object[noOfEmp][];
			 System.out.println("Enter no of referal student");
			 for(int i=0;i<noOfEmp;i++)
			 {
				 
				int noOfStud=scanner.nextInt();
				 
				Object[] o=new Object[noOfStud+1];
				obj[i]=o;
				 
			 }
			 for(int i=0;i<obj.length;i++)
			 {
				 
				 for(int j=0;j<obj[i].length;j++)
				 {
					  if(j==0)
					  {
						  System.out.println("emp id name sal");
						  obj[i][j]=new Employee(scanner.nextInt(), scanner.next(), scanner.nextDouble());
						  //System.out.println(obj[i][j]);
					  }
					  else
					  {
						  System.out.println("student id name");
						  obj[i][j]=new Student(scanner.nextInt(), scanner.next());
					  }
					 
				 }
				 
			 }
			  
			 display(obj);
			 displayNameAndSalaryWithBonus(obj);
		 }
		
		
	}
	static void display(Object[][] obj)
	{
		for(Object[] objects: obj)
		{
			for(Object o:objects)
			{
				System.out.print(o);
			}
			System.out.println();
		}
	}
	static void displayNameAndSalaryWithBonus(Object[][] obj)
	{
		for(Object[] objects: obj)
		{
			for(Object o:objects)
			{
				double bonus=2000*(objects.length-1);
				if(o instanceof Employee)
					System.out.print(((Employee)o).getName()+" "+(((Employee)o).getSalary()+bonus));
			}
			System.out.println();
		}
	}
}
