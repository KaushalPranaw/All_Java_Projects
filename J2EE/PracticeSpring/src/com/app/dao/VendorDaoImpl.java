package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Vendor;

@Repository
public class VendorDaoImpl implements VendorDao {
	
	@Autowired
	private SessionFactory sf;

	
	
	public VendorDaoImpl() {
		System.out.println("In dao");
	}



	@Override
	public Vendor validateUser(String em, String pass) {
		// TODO Auto-generated method stub
		String jpql="select v from Vendor v where v.email=:em and v.password=:pass";
		return sf.getCurrentSession().createQuery(jpql, Vendor.class)
				.setParameter("em", em)
				.setParameter("pass", pass)
				.getSingleResult();
	}



	@Override
	public List<Vendor> getAllVendors() {
		// TODO Auto-generated method stub
		String jpql="select v from Vendor v";
		return sf.getCurrentSession()
				.createQuery(jpql, Vendor.class)
				.getResultList();
	}



	@Override
	public String registerVendor(Vendor v) {
		// TODO Auto-generated method stub
		 sf.getCurrentSession().save(v);
		return "Vendor registered successfully";
	}



	@Override
	public String updateVendor(Vendor v) {
		System.out.println("In update dao");
		sf.getCurrentSession().update(v);
		return "Vendor updated";
	}



	@Override
	public Vendor getVendorDetails(int vid) {
		// TODO Auto-generated method stub
		System.out.println("in vendor details dao");
		Vendor v=sf.getCurrentSession().get(Vendor.class,vid);
		return v;
	}



	@Override
	public String deleteVendor(Vendor v) {
		// TODO Auto-generated method stub
		System.out.println("in delete dao");
		//String jqpl="delete from Vendor v where v.id=:vid";
		//sf.getCurrentSession().createQuery(jqpl, Vendor.class);
		sf.getCurrentSession().delete(v);
		return "Vendor deleted";
	}

	
}
