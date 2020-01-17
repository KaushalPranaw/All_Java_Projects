package com.app.tester;

import com.app.core.Employee;
import com.app.core.Student;

public class Tester {

	public static void main(String[] args) {
		Object[][] obj= {
				{new Employee(1, "pranaw",1000),new Student(101, "raj")},
				{new Employee(2, "pawan",1000),new Student(102, "raj"),new Student(103, "ram")},
				{new Employee(3, "naresh",1000),new Student(104, "raj"),new Student(105, "ram"),new Student(106, "rahul")},
				{new Employee(4, "saheel",1000),new Student(107, "raj"),new Student(108, "ram"),new Student(109, "rakesh")}
		};
		
		display(obj);
		displayNameAndSalaryWithBonus(obj);
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
