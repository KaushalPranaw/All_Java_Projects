package com.yash.service;

import java.util.List;

import com.yash.pojos.Employee;

public interface EmployeeService {
	Employee findByEmployeeId(int employeeId);
	String editEmployee(Employee employee);
	String deleteEmployee(int employeeId);
	List<Employee> findAllEmployee();
	String saveEmployee(Employee employee);
}
