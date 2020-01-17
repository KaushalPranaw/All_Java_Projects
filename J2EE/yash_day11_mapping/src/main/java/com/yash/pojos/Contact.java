package com.yash.pojos;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contact {

	private int code;
	private String number;
	
	private Employee emp;

	public Contact() {
		System.out.println("in const" + getClass().getName());
	}

	public Contact(int code, String number) {
		super();
		this.code = code;
		this.number = number;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	
	
	
	@ManyToOne
	@JoinColumn(name="e_id")
	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Contact [code=" + code + ", number=" + number+ "]";
	}
	
	
	
	

}
