package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.CustomerDao;
import com.app.pojos.Customer;

@Service 
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao dao;
	
	
	
	public CustomerServiceImpl() {
		System.out.println("in service");
	}

	@Override
	public String register(Customer c) {
		// TODO Auto-generated method stub
		return dao.register(c);
	}

	@Override
	public Customer login(String em, String pass) {
		// TODO Auto-generated method stub
		return dao.login(em, pass);
	}

	@Override
	public Customer getById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return dao.getAllCustomer();
	}

	@Override
	public String deleteCust(int id) {
		// TODO Auto-generated method stub
		return dao.deleteCust(dao.getById(id));
	}

	@Override
	public String updateCust(Customer c) {
		// TODO Auto-generated method stub
		return dao.updateCust(c);
	}

	
	
}
