package com.yash.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yash.pojos.Vendor;

@Repository
public class VendorDaoImpl implements VendorDao{

	@Autowired
	SessionFactory sf;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Vendor> findAll() {
		String jpql="select v from Vendor v";
		
		return sf.getCurrentSession().createQuery(jpql).list();
	}

	@Override
	public Vendor findById(int id) {
		// TODO Auto-generated method stub
		return (Vendor) sf.getCurrentSession().get(Vendor.class, id);
	}

	@Override
	public String createVendor(Vendor v) {
		// TODO Auto-generated method stub
		 sf.getCurrentSession().save(v);
		 return "saved with id "+v.getId();
	}

	@Override
	public String updateVendor(Vendor v) {
		sf.getCurrentSession().saveOrUpdate(v);
		return "updated id "+v.getId();
	}

	@Override
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(findById(id));
		return "deleted id "+id;
	}

	
}
