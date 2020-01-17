package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {

	private String email, password;
	private double regAmount;
	private Date date;
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public Customer(String email, String password, double regAmount, Date date) {
		super();
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.date = date;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
		System.out.println("in cust");
	}

	@Override
	public String toString() {
		return "Customer [email=" + email + ", password=" + password + ", regAmount=" + regAmount + ", date="
				+ sdf.format(date) + "]";
	}

}
