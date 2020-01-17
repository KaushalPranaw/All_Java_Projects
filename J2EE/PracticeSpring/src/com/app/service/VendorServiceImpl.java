package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.VendorDao;
import com.app.pojos.Vendor;

@Service("dao_based")
@Transactional
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorDao dao;
	
	@Override
	public Vendor validateUser(String em, String pass) {
		// TODO Auto-generated method stub
		return dao.validateUser(em, pass);
	}

	@Override
	public List<Vendor> getAllVendors() {
		// TODO Auto-generated method stub
		return dao.getAllVendors();
	}

	@Override
	public String registerVendor(Vendor v) {
		// TODO Auto-generated method stub
		return dao.registerVendor(v);
	}

	@Override
	public String updateVendor(Vendor v) {
		// TODO Auto-generated method stub
		return dao.updateVendor(v);
	}

	@Override
	public Vendor getVendorDetails(int vid) {
		// TODO Auto-generated method stub
		return dao.getVendorDetails(vid);
	}

	@Override
	public String deleteVendor(Vendor v) {
		// TODO Auto-generated method stub
		return dao.deleteVendor(v);
	}

}
