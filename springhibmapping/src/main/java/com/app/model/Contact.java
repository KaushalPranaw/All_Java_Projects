package com.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity  
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int code;
	private String number;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private Employee employee;

	public Contact() {
		super();
		
	}

	

	public Contact(int code, String number, Employee employee) {
		super();
		this.code = code;
		this.number = number;
		this.employee = employee;
	}



	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	

	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Contact [code=" + code + ", number=" + number + "]";
	}

}
