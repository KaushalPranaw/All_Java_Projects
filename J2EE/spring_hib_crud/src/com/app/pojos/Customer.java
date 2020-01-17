package com.app.pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="customer")
public class Customer {

	private int id;
	private String name,email,password;
	private String role;
	private double salary;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date date1;
	public Customer() {
		System.out.println("in cust");
	}
	 
	 
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



 
	
	@Column
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	@Column(unique=true)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Column(columnDefinition="double(8,2)")
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Temporal(TemporalType.DATE)
	public Date getDate1() {
		return date1;
	}



	public void setDate1(Date date1) {
		this.date1 = date1;
	}


 
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", role="
				+ role + ", salary=" + salary + ", date=" + date1 + "]";
	}



	
	
	
}
