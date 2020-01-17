package com.yash.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yash.pojos.Customer;

@Service("cust_service")
@Transactional
public class CustomerServiceImpl implements CustomerService {

	// @Autowired
	// CustomerDao dao = new CustomerDaoImpl();
	static List<Customer> customers = new ArrayList<Customer>(
			Arrays.asList(new Customer(1, "pranaw", 43939, "2-2-2018"), new Customer(2, "saibin", 43939, "2-2-2018"),
					new Customer(3, "saurabh", 43939, "2-2-2018"), new Customer(4, "raju", 43939, "2-2-2018")));

	@Override
	public Customer getById(Integer id) {
		for (Customer c : customers) {
			if (c.getId() == id)
				return c;
		}
		return null;
	}

	@Override
	public Customer getByName(String name) {
		for (Customer c : customers) {
			if (c.getName().equalsIgnoreCase(name))
				return c;
		}
		return null;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customers;
	}

	@Override
	public void deleteCustomerById(int id) {
		Iterator<Customer> i = customers.iterator();
		if (i.hasNext()) {
			Customer c = i.next();
			if (c.getId() == id)
			{
				i.remove();
				System.out.println("id "+id+" deleted");
			}
		}
		

	}

	@Override
	public void deleteAllCustomer() {
		customers.clear();

	}

	@Override
	public void saveCustomer(Customer cust) {
		System.out.println("service " + cust);
		customers.add(cust);
		System.out.println();
		System.out.println(customers);

	}

	@Override
	public Customer updateCustomer(int id, Customer c) {
			System.out.println(c);
		for (Customer newCust : customers) {
			if (newCust.getId() == id) {
				System.out.println("Old : " + newCust);
				newCust.setName(c.getName());
				newCust.setDate(c.getDate());
				newCust.setSalary(c.getSalary());
				System.out.println("New : " + newCust);
				return newCust;
			}
		}

		return null;

	}

	@Override
	public boolean isCustomerExist(Customer user) {
		return getByName(user.getName()) != null;

	}

}
