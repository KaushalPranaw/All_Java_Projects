package com.app.service;

import java.util.List;


import com.app.model.Employee;

public interface EmpService {

	public List<Employee> findAllEmp();

	public void deleteEmployeeById(int id);

	public void saveEmployee(Employee employee);
	
	public Employee findEmployeeById(int id);

	public void updateEmployee(Employee employee);
}
