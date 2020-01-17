package beans;

import java.sql.Date;

import dao.CustDaoImpl;
import pojos.Customer;

public class CustBeans {
	
	private String email,pass;
	private String name,role;
	private String date;
	private double regAmount;
	
	private String status;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	 
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getRegAmount() {
		return regAmount;
	}

	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}


	private CustDaoImpl dao;
	
	public CustBeans() throws Exception {
		dao=new CustDaoImpl();
		System.out.println("bean created");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	//B.L
	public String validateUser() throws Exception
	{
		 
		Customer validCust=dao.validatUser(email, pass);
		if (validCust == null) {
			status = "Invalid Login  pls Retry";
			return "login";
		}
		status = "Login Successful";
		return "category";
	}
	
	public String register() throws Exception
	{
		Customer c=new Customer(regAmount, email, name, pass, Date.valueOf(date), role);
		String status=dao.register(c);
		return status;
	}

}
