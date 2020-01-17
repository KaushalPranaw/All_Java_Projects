package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Customer;

import static utils.HibernateUtils.*;

import java.util.List;
public class CustomerDaoImpl implements CustomerDao {

	private String s=null;
	
	public CustomerDaoImpl() {
		System.out.println("in dao");
	}
	
	@Override
	public String registerCustomer(Customer c) {
		Integer id;
		Session hs=getSf().getCurrentSession();
		
		Transaction tx=hs.beginTransaction();
		try
		{
			//System.out.println(c);
			
			 id=(Integer)hs.save(c);
			tx.commit();
		}
		catch(HibernateException e)
		{
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		
		return "customer registered successfully with id "+id;
	}

	@Override
	public Customer validateCustomer(String em, String pass) {
		Customer c=null;
		Session hs=getSf().getCurrentSession();
		String jpql="select c from Customer c where "+"c.email=:e and c.password=:p";
		Transaction tx=hs.beginTransaction();
		try
		{
			c=hs.createQuery(jpql, Customer.class).setParameter("e", em).setParameter("p", pass).getSingleResult();
			System.out.println(c);
			tx.commit();
		}
		catch(HibernateException e)
		{
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		
		return c;
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		System.out.println("in get all cust");
		
		List<Customer> list=null;
		Session hs=getSf().getCurrentSession();
		String jpql="select c from Customer c";
		Transaction tx=hs.beginTransaction();
		try
		{
			list=hs.createQuery(jpql, Customer.class).getResultList();
			//list.forEach(System.out::println);
			tx.commit();
		}
		catch(HibernateException e)
		{
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		
		return list;
	}
	
	

	@Override
	public Customer getCustomerById(int id) {
		Customer c=null;
		System.out.println("in get cust by id");
		Session hs=getSf().getCurrentSession();
		String jpql="select c from Customer c where c.custId=:id";
		Transaction tx=hs.beginTransaction();
		try
		{
			c=hs.createQuery(jpql, Customer.class).setParameter("id", id).getSingleResult();
			 
			System.out.println(c);
			tx.commit();
		}
		catch(HibernateException e)
		{
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		
		return c;
	}

	@Override
	public String deleteCustomer(Customer c) {
		System.out.println("in delete");
		Session hs=getSf().getCurrentSession();
		 
		Transaction tx=hs.beginTransaction();
		try
		{
			hs.delete(c);
			s="deleted";
			System.out.println(s);
			tx.commit();
		}
		catch(HibernateException e)
		{
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		
		return s;
	}

	@Override
	public String updateCustomer(Customer c) {
		String s=null;
		System.out.println("in update");
		Session hs=getSf().getCurrentSession();
		 
		Transaction tx=hs.beginTransaction();
		try
		{
			hs.update(c);
			s="updated";
			System.out.println(s);
			tx.commit();
		}
		catch(HibernateException e)
		{
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		
		return s;
	}
	
	

	
	
}
