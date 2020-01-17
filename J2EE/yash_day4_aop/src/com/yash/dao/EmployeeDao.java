package com.yash.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.yash.pojos.Employee;

@Component
public class EmployeeDao {

	public List<Employee> getAllEmp()
	{
		System.out.println("getAllEmp() called");
		return new ArrayList<Employee>();
	}
	
	
	
}
