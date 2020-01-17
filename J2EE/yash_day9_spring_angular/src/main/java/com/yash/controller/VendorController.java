package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.pojos.Vendor;
import com.yash.service.VendorService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class VendorController {

	@Autowired
	VendorService service;
	
	@PostMapping("saveVendor")
	public String saveCustomer(@RequestBody Vendor v)
	{
		return service.createVendor(v);
	}
	
	@GetMapping("allVendor")
	public List<Vendor> getVendors()
	{
		
		return service.findAll();
	}
	
	@PutMapping("updateVendor/{id}")
	public String updateVendor(@RequestBody Vendor v,@PathVariable("id") String id)
	{
		v.setId(Integer.parseInt(id));
		return service.updateVendor(v);
	}
	@DeleteMapping("deleteVendor/{id}")
	public String deleteVendor(@PathVariable("id") String id)
	{
		//v.setId(Integer.parseInt(id));
		
		return service.deleteVendor(service.findById(Integer.parseInt(id)));
	}
	 
}