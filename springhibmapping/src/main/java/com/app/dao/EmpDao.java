package com.app.dao;

import java.util.List;

import com.app.model.Employee;

public interface EmpDao {

	List<Employee> findAllEmp();

	void deleteEmployeeById(int id);

	void saveEmployee(Employee employee);

	Employee findEmployeeById(int id);

	void updateEmployee(Employee employee);
	

}
