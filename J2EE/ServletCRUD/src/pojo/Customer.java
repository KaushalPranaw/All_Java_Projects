package pojo;

import java.sql.Date;

public class Customer {

	private int id;
	private double regAmount;
	private String email,name,password;
	private Date date;
	private String role;
	
	public Customer() {
		// TODO Auto-generated constructor stub
		System.out.println("in cust");
	}

	public Customer(int id, double regAmount, String email, String name, String password, Date date, String role) {
		super();
		this.id = id;
		this.regAmount = regAmount;
		this.email = email;
		this.name = name;
		this.password = password;
		this.date = date;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRegAmount() {
		return regAmount;
	}

	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", regAmount=" + regAmount + ", email=" + email + ", name=" + name + ", password="
				+ password + ", date=" + date + ", role=" + role + "]";
	}
	
		
}
