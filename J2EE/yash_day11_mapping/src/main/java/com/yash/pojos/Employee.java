package com.yash.pojos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	private int id;
	private String name;
	private double salary;
	private byte[] photo;

	private List<Contact> contactList = new ArrayList<>();

	private List<Course> courseList = new ArrayList<>();
	
	private Address address;

	//----------------------------------------------------------------------------
	
	public Employee() {
		System.out.println("in const" + getClass().getName());
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee(int id, String name, double salary, byte[] photo, List<Contact> contactList,
			List<Course> courseList, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.photo = photo;
		this.contactList = contactList;
		this.courseList = courseList;
		this.address = address;
	}
	
	//-----------------------------------------------------------------------------------

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@Column(columnDefinition = "double(10,2)")
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Lob
	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}


	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@OneToMany(mappedBy = "emp", cascade = CascadeType.ALL)
	public List<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}

	@ManyToMany(mappedBy = "empSet", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	// ------------------------------

	public void addAddress(Address address) {
		System.out.println(this.toString());
		setAddress(address);
		address.setEmployee(this);
	}

	public void removeAddress(Address address) {
		System.out.println("remove address");
		setAddress(null);
		address.setEmployee(null);
	}

	// ;----------------------------------------------------

	public void addContact(Contact contact) {
		contactList.add(contact);
		contact.setEmp(this);
	}

	public void removeContact(Contact contact) {
		System.out.println("remove contact");
		contactList.remove(contact);
		contact.setEmp(null);
	}

	// ------------------------------------------------------------

	public void addCourse(Course course) {
		System.out.println("a");
		this.courseList.add(course);
		course.getEmpSet().add(this);
	}

	public void removeCourse(Course course) {
		System.out.println("remove course");
		this.courseList.remove(course);
		course.getEmpSet().remove(this);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", photo=" + Arrays.toString(photo)
				+ ", contactList=" + contactList + ", courseList=" + courseList + ", address=" + address + "]";
	}

	// ------------------------------------------------

	

}
