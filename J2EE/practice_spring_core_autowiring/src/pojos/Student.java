package pojos;

import java.util.List;

public class Student {

	private int id;
	private String name;
	//private Address address;
	private List<String> subjects;
	private List<Address> addresses;

	public Student() {
		System.out.println(" const of "+getClass().getName());
	}
	
	

	public Student(int id, String name, List<String> subjects, List<Address> addresses) {
		super();
		this.id = id;
		this.name = name;
		this.subjects = subjects;
		this.addresses = addresses;
	}



	/*
	 * public Student(int id) { super(); System.out.println("int "); this.id = id; }
	 * 
	 * public Student(String name) { super(); System.out.println("string ");
	 * this.name = name; }
	 * 
	 * public Student(int id, String name) { super();
	 * System.out.println("id string "); this.id = id; this.name = name; }
	 */

	/*public void show() {
		System.out.println(id + " " + name);
		System.out.println(address.toString());
	}*/

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

	/*public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}*/

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	
	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subjects=" + subjects + ", addresses=" + addresses + "]";
	}

	/*@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", subjects=" + subjects + "]";
	}*/

	
	/*public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}*/
	
	

}
