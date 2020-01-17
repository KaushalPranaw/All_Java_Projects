package com.yash.dao;

import java.util.List;

import com.yash.pojos.Employee;

public interface EmployeeDao {

	List<Employee> getAllEmp();
	Employee getEmpById(int id);
	String deleteEmp(int id);
	String updateEmp(int id,Employee emp);
	String insertEmp(Employee emp);
	
}
