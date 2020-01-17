package com.app.core;


public class Employee {

	private int id;
	private String name;
	private double salary;
	private EmpDate doj;
	private EmpDate dob;
	public Employee(int id, String name, double salary, EmpDate doj, EmpDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
		this.dob = dob;
	}
	public Employee() {
		super();
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
	public EmpDate getDoj() {
		return doj;
	}
	public void setDoj(EmpDate doj) {
		this.doj = doj;
	}
	public EmpDate getDob() {
		return dob;
	}
	public void setDob(EmpDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", doj=" + doj + ", dob=" + dob + "]";
	}
	
	
}
