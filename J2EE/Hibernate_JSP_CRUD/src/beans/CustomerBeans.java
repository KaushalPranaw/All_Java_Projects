package beans;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException; 

import dao.CustomerDao;
import dao.CustomerDaoImpl;
import pojos.Customer;

public class CustomerBeans {

	private String name,password,email,role;
	private String date;
	private double amount;
	
	private CustomerDao dao;
	private String status="";
	private Customer c;
	
	private int id;
	
	public CustomerBeans() {
		System.out.println("bean created");
		dao=new CustomerDaoImpl();
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}



	private static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("yyyy-MM-dd");
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}


	
	public void setDate(String date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	//B.L method
	public String registerCust() throws ParseException
	{
		 
		c=new Customer(name, email, password, role, amount, sdf.parse(date));
	//	System.out.println(c);
		status="welcome "+c.getName();
		return dao.registerCustomer(c);
	}
	
	public String validate()
	{
		System.out.println(email+" "+password);
		try
		{
			c=dao.validateCustomer(email, password);
		}
		catch(NoResultException e)
		{
			System.out.println("err in jb "+e);
			status="invalid login , please retry";
			return "login";
		}
		System.out.println(c);
		status="successfully logged in with id "+c.getCustId();
		
		
		return "home";
	}
	
	public List<Customer> getAllCust()
	{
		
		System.out.println("in get all cust bean");
		
		ArrayList<Customer> l=  (ArrayList<Customer>) dao.getAllCustomer();
		return l;
	}
	public Customer getCustById()
	{
		System.out.println("in get cust by id");
		Customer c=dao.getCustomerById(id);
		try {
			c.setDate(sdf.parse(String.valueOf(c.getDate())));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c);
		return c;
	}
	public void delete()
	{
		System.out.println("in del bean");
		System.out.println(id);
		status=dao.deleteCustomer(dao.getCustomerById(id));
	}
	
	public String update()
	{
		System.out.println("in update");
		try {
			c=new Customer(id,name, email, password, role, amount, sdf.parse(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		status=dao.updateCustomer(c);
		return status;
	}
}
