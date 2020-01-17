package com.yash.service;

import java.util.List;

import com.yash.pojos.Customer;

public interface CustomerService {

	Customer getById(Integer id);
	Customer getByName(String name);
	List<Customer> getAllCustomer();
	
	void deleteCustomerById(int id);
	void deleteAllCustomer();
	void saveCustomer(Customer cust);
	Customer updateCustomer(int id,Customer c);
	boolean isCustomerExist(Customer user);
	
}
