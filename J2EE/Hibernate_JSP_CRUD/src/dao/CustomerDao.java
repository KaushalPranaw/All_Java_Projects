package dao;

import java.util.List;

import pojos.Customer;

public interface CustomerDao {

	public String registerCustomer(Customer c);
	public Customer validateCustomer(String em,String pass);
	List<Customer> getAllCustomer();
	String deleteCustomer(Customer c);
	String updateCustomer(Customer c);
	Customer getCustomerById(int id);
	
}
