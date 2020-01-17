package com.app.core;

public class Tester {

	public static void main(String[] args) {
		
		Employee employee[][]=
			{
					{new Employee(1, "ram", 1000, new EmpDate(1, 2, 2019), new EmpDate(1, 2, 2019)),
			new Employee(1, "ram", 1000, new EmpDate(1, 2, 2019), new EmpDate(1, 2, 2019))},
				
					{new Employee(1, "ram", 1000, new EmpDate(1, 2, 2019), new EmpDate(1, 2, 2019)),
				new Employee(1, "ram", 1000, new EmpDate(1, 2, 2019), new EmpDate(1, 2, 2019)),
				new Employee(1, "ram", 1000, new EmpDate(1, 2, 2019), new EmpDate(1, 2, 2019))
				}
			};
		
			
			display(employee);
			displayIdAndDOJ(employee);
		
	}
	static void display(Employee employee[][])
	{
		for(Employee[] emp:employee)
		{
			for(Employee e: emp)
			{
				System.out.println(e);
			}
		}
	}
	
	static void displayIdAndDOJ(Employee employee[][])
	{
		for(Employee[] emp:employee)
		{
			for(Employee e: emp)
			{
				System.out.println("Emp id : "+e.getId()+" "+", DOJ : "+e.getDoj() );
			}
		}
	}
}
