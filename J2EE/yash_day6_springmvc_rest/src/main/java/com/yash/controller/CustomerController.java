package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.yash.pojos.Customer;
import com.yash.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	@Qualifier("cust_service")
	CustomerService service;

	@GetMapping("/allCust")
	public ResponseEntity<List<Customer>> listAllCust() {
		if (service.getAllCustomer().isEmpty())
			return new ResponseEntity<List<Customer>>(HttpStatus.NOT_FOUND);
		return ResponseEntity.ok(service.getAllCustomer());
	}

	/*
	 * @GetMapping("/allCust/{id}") public ResponseEntity<Customer>
	 * getCustomerById(@PathVariable("id") int id) {
	 * System.out.println("fetching cust id with : "+id);
	 * if(service.getById(id)==null) return new
	 * ResponseEntity<Customer>(HttpStatus.NOT_FOUND); return new
	 * ResponseEntity<Customer>(service.getById(id),HttpStatus.OK); }
	 */

	@GetMapping("/allCust/{name}")
	public ResponseEntity<Customer> getCustomerByName(@PathVariable("name") String name) {
		System.out.println("fetching cust name with : " + name);
		if (service.getByName(name) == null)
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Customer>(service.getByName(name), HttpStatus.OK);
	}

	@PostMapping("/saveCust")
	public ResponseEntity<Void> saveCustomer(@RequestBody Customer cust, UriComponentsBuilder builder) {
		System.out.println("creating customer : " + cust.getName());
		if (service.isCustomerExist(cust)) {
			System.out.println("Cust with name already exist");
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		service.saveCustomer(cust);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/allCust/{id}").buildAndExpand(cust.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@PutMapping("/allCust/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable("id") int id, @RequestBody Customer customer) {

		System.out.println("updating id : " + id);
		Customer c = service.updateCustomer(id, customer);
		if (c == null)
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Customer>(c, HttpStatus.OK);

	}

	@DeleteMapping("/allCust/{id}")
	public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") int id) {

		System.out.println("deleting id : " + id);

		Customer c = service.getById(id);
		if (c == null) {
			System.out.println("Unable to delete. Customer with id " + id + " not found");
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}

		service.deleteCustomerById(id);

		return new ResponseEntity<Customer>(c, HttpStatus.OK);

	}
	
	@DeleteMapping("/allCust")
	public ResponseEntity<Customer> deleteAllCustomer() {

		System.out.println("deleting all cust");

		 
		service.deleteAllCustomer();
		System.out.println("deleted");
		return new ResponseEntity<Customer>(HttpStatus.OK);

	}

}
