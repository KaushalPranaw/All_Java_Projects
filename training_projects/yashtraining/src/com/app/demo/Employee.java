package com.app.demo;

import java.util.Arrays;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private EmpDate empDate[]=new EmpDate[2];;
	public Employee(int id, String name, double salary, EmpDate doj,EmpDate dob) {
		 
		 
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.empDate[0] = doj;
		this.empDate[1] = dob;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public EmpDate[] getEmpDate() {
		return empDate;
	}
	public void setEmpDate(EmpDate[] empDate) {
		this.empDate = empDate;
	}
	 
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", empDate=" + Arrays.toString(empDate)
				+ "]";
	}
	
}
