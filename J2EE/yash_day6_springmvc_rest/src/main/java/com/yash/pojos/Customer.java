package com.yash.pojos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {

	private Integer Id;
	private String name;
	private double salary;
	private String date;
	
	private static SimpleDateFormat sdf;
	
	static
	{
		sdf=new SimpleDateFormat("dd-mm-yyyy");
	}
	
	public Customer() {
		System.out.println("in cust const");
	}
	public Customer(Integer id, String name, double salary, String date) {
		super();
		Id = id;
		this.name = name;
		this.salary = salary;
		this.date = date;
	}
	
	
	public Customer(String name, double salary, String date) {
		super();
		this.name = name;
		this.salary = salary;
		this.date = date;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", name=" + name + ", salary=" + salary + ", date=" +date + "]";
	}
	
	
}
