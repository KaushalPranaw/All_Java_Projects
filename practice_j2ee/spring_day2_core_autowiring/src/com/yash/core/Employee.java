package com.yash.core;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int id;
	private String name;
	private double salary;

	private Address addr4;

	public Employee(int id, String name, double salary, Address addr3) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.addr4 = addr3;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", addr3=" + addr4 + "]";
	}

	
	
}
