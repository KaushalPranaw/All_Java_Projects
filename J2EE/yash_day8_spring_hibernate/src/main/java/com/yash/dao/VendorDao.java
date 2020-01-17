package com.yash.dao;

import java.util.List;

import com.yash.pojos.Vendor;

public interface VendorDao {

	List<Vendor> findAll();

	Vendor findById(int id);

	String createVendor(Vendor v);

	String updateVendor(Vendor v);

	String deleteById(int id);
}
