package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	
	@Autowired
	SessionFactory sf;
	
	public CustomerDaoImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("in dao cust");
	}
	
	@Override
	public String register(Customer c) {
		System.out.println(c);
		sf.getCurrentSession().save(c);
		return "registered successfully";
	}

	@Override
	public Customer login(String em, String pass) {
		// TODO Auto-generated method stub
		System.out.println(em+" "+pass);
		String jpql="select c from Customer c where c.email=:e and c.password=:p";
		return sf.getCurrentSession()
				.createQuery(jpql, Customer.class)
					.setParameter("e", em)
					.setParameter("p", pass)
					.getSingleResult();
		  
	}

	@Override
	public Customer getById(int id) {
		// TODO Auto-generated method stub
		String jpql="select c from Customer c where c.id=:id";
		
		return sf.getCurrentSession().createQuery(jpql, Customer.class).setParameter("id", id).getSingleResult();
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		String jpql="select c from Customer c";
		
		return sf.getCurrentSession().createQuery(jpql, Customer.class).getResultList();
	}

	@Override
	public String deleteCust(Customer c) {
		// TODO Auto-generated method stub
		System.out.println("delete ::: "+c);
		sf.getCurrentSession().delete(c);
		return "deleted successfully";
	}

	@Override
	public String updateCust(Customer c) {
		System.out.println("update ::: "+c);
		sf.getCurrentSession().update(c);
		return "updated successfully";
	}

	
	
	
}
