package com.yash.core;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int id;
	private String name;
	private double salary;

	private Address address;
	
	private List<String> subjects;

	private Set<Address> addresses;

	private Map<Address, Address> addressesMap;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	public Map<Address, Address> getAddressesMap() {
		return addressesMap;
	}

	public void setAddressesMap(Map<Address, Address> addressesMap) {
		this.addressesMap = addressesMap;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + ", subjects="
				+ subjects + ", addresses=" + addresses + ", addressesMap=" + addressesMap + "]";
	}

	

}
