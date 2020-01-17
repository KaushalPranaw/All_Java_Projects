package com.app.dao;

import java.util.List;

import com.app.pojos.Customer;

public interface CustomerDao {

	String register(Customer c);
	Customer login(String em,String pass);
	
	Customer getById(int id);
	List<Customer> getAllCustomer();
	String deleteCust(Customer c);
	String updateCust(Customer c);
}
