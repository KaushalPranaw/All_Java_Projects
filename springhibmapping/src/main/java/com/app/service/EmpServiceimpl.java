package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.EmpDao;
import com.app.model.Employee;



@Service
@Transactional
public class EmpServiceimpl implements EmpService {

	@Autowired 
	EmpDao dao;
	public List<Employee> findAllEmp() {
		
		return dao.findAllEmp();
	}
	@Override
	public void deleteEmployeeById(int id) {
	
		dao.deleteEmployeeById(id);
		
	}
	@Override
	public void saveEmployee(Employee employee) {
		
		dao.saveEmployee(employee);
		
	}
	@Override
	public Employee findEmployeeById(int id) {
		
		return dao.findEmployeeById(id);
	}
	@Override
	public void updateEmployee(Employee employee) {
		dao.updateEmployee(employee);
	}

	

}
