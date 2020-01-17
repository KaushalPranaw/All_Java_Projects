package com.app.service;
 

import java.util.List;

import com.app.pojos.Customer;

 
public interface CustomerService {

	String register(Customer c);
	Customer login(String em,String pass);
	
	Customer getById(int id);
	List<Customer> getAllCustomer();
	String deleteCust(int id);
	String updateCust(Customer c);
}
