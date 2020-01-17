package com.yash.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.dao.VendorDao;
import com.yash.pojos.Vendor;

@Service
@Transactional
public class VendorServiceImpl implements VendorService {

	@Autowired
	VendorDao dao;

	@Override
	public List<Vendor> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Vendor findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public String createVendor(Vendor v) {
		// TODO Auto-generated method stub
		return dao.createVendor(v);
	}

	@Override
	public String updateVendor(Vendor v) {
		// TODO Auto-generated method stub
		return dao.updateVendor(v);
	}

	@Override
	public String deleteVendor(Vendor v) {
		// TODO Auto-generated method stub
		return dao.deleteVendor(v);
	}

	 
	
	
	
}
