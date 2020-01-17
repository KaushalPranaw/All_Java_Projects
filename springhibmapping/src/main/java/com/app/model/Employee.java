package com.app.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Size(min = 3, max = 50)
	@Column(name = "NAME", nullable = false)
	private String name;

	@NotNull
	@Column(name = "TASK", nullable = false)
	private String task;

	@NotNull
	@Column(name = "ASSIGNEDBY", nullable = false)
	private String assignedby;

	@NotEmpty
	@Column(name = "STATUS", nullable = false)
	private String status;

	@Lob
	private byte[] image;

	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)

	private Address address;

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.EAGER)

	private List<Contact> contactList = new ArrayList<Contact>();

	@ManyToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private List<Courses> course = new ArrayList<>();

	public Employee() {
		super();

	}

	public Employee(int id, String name, String task, String assignedby, String status, byte[] image, Address address,
			List<Contact> contactList, List<Courses> course) {
		super();
		this.id = id;
		this.name = name;
		this.task = task;
		this.assignedby = assignedby;
		this.status = status;
		this.image = image;
		this.address = address;
		this.contactList = contactList;
		this.course = course;
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

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;

	}

	public String getAssignedby() {
		return assignedby;
	}

	public void setAssignedby(String assignedby) {
		this.assignedby = assignedby;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}

	public List<Courses> getCourse() {
		return course;
	}

	public void setCourse(List<Courses> course) {
		this.course = course;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", task=" + task + ", assignedby=" + assignedby + ", status="
				+ status + "]";
	}

	public void addAddress(Address address) {
		System.out.println("addAddress()");
		this.setAddress(address);
		address.setEmployee(this);
	}

	public void addContact(Contact contact) {
		System.out.println("addContact()");
		this.contactList.add(contact);
		contact.setEmployee(this);
	}

	public void addCourse(Courses courses) {
		this.course.add(courses);
		courses.getEmployee().add(this);
	}

	public void removeAddress(Address address) {
		this.setAddress(null);
		address.setEmployee(null);

	}

	public void removeContact(Contact contact) {
		this.setContactList(null);
		contact.setEmployee(null);

	}

	public void removeCourse(Courses course) {
		this.course.add(null);

		course.getEmployee().add(null);

	}
}