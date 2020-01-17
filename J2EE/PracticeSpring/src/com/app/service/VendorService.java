package com.app.service;
  
import java.util.List;

import com.app.pojos.Vendor;

public interface VendorService {

	Vendor validateUser(String em,String pass);
	List<Vendor> getAllVendors();
	String registerVendor(Vendor v);
	String updateVendor(Vendor v);
	
	Vendor getVendorDetails(int vid);
	String deleteVendor(Vendor v);
}
