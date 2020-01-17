package com.yash.tester;

import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.yash.pojos.Customer;

public class ClientTest {
	
	 
	
	public static final String REST_SERVICE_URI= "http://localhost:8080/yash_day6_springmvc_rest";
	
	@SuppressWarnings("unused")
	private static void listAllUser()
	{
		RestTemplate restTemplate=new RestTemplate();
		@SuppressWarnings("unchecked")
		List<LinkedHashMap<String, Object>> userMap=restTemplate.getForObject(REST_SERVICE_URI+"/customer/allCust", List.class);
		
		if(userMap!=null)
		{
			userMap.forEach((v)->{
				/*System.out.println(v.get("id")+" "+v.get("name")+" "+v.get("date")+" "+v.get("salary"));*/
				System.out.println(v);
			});
		}
		else
		{
			System.out.println("No user exist");
		}
	}
	
	@SuppressWarnings("unused")
	private static void getUserById()
	{
		RestTemplate restTemplate=new RestTemplate();
		@SuppressWarnings("unchecked")
		Customer c=restTemplate.getForObject(REST_SERVICE_URI+"/customer/allCust/1", Customer.class);
		if(c==null)
			System.out.println("No user exist");
		System.out.println(c);
	}
	
	@SuppressWarnings("unused")
	private static void getUserByName()
	{
		RestTemplate restTemplate=new RestTemplate();
		@SuppressWarnings("unchecked")
		Customer c=restTemplate.getForObject(REST_SERVICE_URI+"/customer/allCust/raju", Customer.class);
		if(c==null)
			System.out.println("No user exist");
		System.out.println(c);
	}
	
	/*post*/
	@SuppressWarnings("unused")
	private static void createCustomer()
	{
		System.out.println("in save");
		RestTemplate restTemplate=new RestTemplate();
		Customer c=new Customer(10,"pranawww", 111, "2-2-1111");
		 
		URI uri=restTemplate.postForLocation(REST_SERVICE_URI+"/customer/saveCust", c, Customer.class);
		System.out.println(uri.toASCIIString());
	}
	
	@SuppressWarnings("unused")
	private static void updateCustomer()
	{
		System.out.println("in update");
		RestTemplate restTemplate=new RestTemplate();
		Customer c=new Customer(2,"pranaw11", 111, "2-2-1111");
		 
		restTemplate.put(REST_SERVICE_URI+"/customer/allCust/2", c);
		System.out.println(c);
	}
	
	@SuppressWarnings("unused")
	private static void deleteCustomer()
	{
		System.out.println("in delete");
		RestTemplate restTemplate=new RestTemplate();
		restTemplate.delete(REST_SERVICE_URI+"/customer/allCust/2");
		 
		 
	}
	
	@SuppressWarnings("unused")
	private static void deleteCustomerAll()
	{
		System.out.println("in delete");
		RestTemplate restTemplate=new RestTemplate();
		restTemplate.delete(REST_SERVICE_URI+"/customer/allCust");
		 
		 
	}

	public static void main(String[] args) {
		listAllUser();
		//getUserById();
		//getUserByName();
		
		//createCustomer();
		//listAllUser();
		
		//updateCustomer();
		//listAllUser();
		
		//deleteCustomer();
		//listAllUser();
		
		//deleteCustomerAll();
		//listAllUser();
		
	}
}
