package com.app.demo;

public class Tester {

	public static void main(String[] args) {
		
		Employee employee[]=
				{ new Employee(1, "abc", 1000,new EmpDate(1, 2, 2019),new EmpDate(1, 2, 2019)),
					new Employee(2, "ram", 2000,new EmpDate(1, 2, 2019),new EmpDate(1, 2, 2019))
			 };
		
			 
		
			 
			display(employee);
			displayIdAndDOJ(employee);
		
	}
	static void display(Employee employee[])
	{
		for(Employee emp:employee)
		{
			 
				System.out.println(emp);
			 
		}
	}
	
	static void displayIdAndDOJ(Employee employee[])
	{
		 
			for(Employee e: employee)
			{
				System.out.println("Emp id : "+e.getId()+" "+", DOJ : "+e.getEmpDate()[0] );
			}
		
	}
}
