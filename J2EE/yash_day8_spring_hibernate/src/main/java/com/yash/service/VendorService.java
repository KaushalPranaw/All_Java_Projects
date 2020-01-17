package com.yash.service;

import java.util.List;

import com.yash.pojos.Vendor;

public interface VendorService {

	List<Vendor> findAll();

	Vendor findById(int id);

	String createVendor(Vendor v);

	String updateVendor(Vendor v);

	String deleteById(int id);
}
