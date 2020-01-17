package pojos;

import java.util.*;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private Date joining_date;
	private Address address;

	public Employee() {
		System.out.println("In constructor of " + getClass().getName());
	}

	public Employee(int id, String name, double salary, Date joining_date, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joining_date = joining_date;
		this.address = address;
	}
	
	

	public Employee(String name, double salary, Date joining_date) {
		super();
		this.name = name;
		this.salary = salary;
		this.joining_date = joining_date;
	}

	public Employee(int id, String name, double salary, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joining_date = date;
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

	public Date getJoining_date() {
		return joining_date;
	}

	public void setJoining_date(Date joining_date) {
		this.joining_date = joining_date;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", joining_date=" + joining_date + "]";
	}

	

}
