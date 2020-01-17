package com.app.dao;
 
import java.util.List;

import com.app.pojos.Vendor;


public interface VendorDao {

	Vendor validateUser(String em,String pass);
	List<Vendor> getAllVendors();
	String registerVendor(Vendor v);
	
	Vendor getVendorDetails(int vid);
	String deleteVendor(Vendor v);
	
	String updateVendor(Vendor v);
}
