package com.yash.core;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int id;
	private String name;
	private double salary;

	private List<String> subjects;

	private Set<Address> addresses;

	private Map<Address, Address> addressesMap;

	public Employee(int id, String name, double salary, List<String> subjects, Set<Address> addresses,
			Map<Address, Address> addressesMap) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.subjects = subjects;
		this.addresses = addresses;
		this.addressesMap = addressesMap;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", subjects=" + subjects
				+ ", addresses=" + addresses + ", addressesMap=" + addressesMap + "]";
	}

}
