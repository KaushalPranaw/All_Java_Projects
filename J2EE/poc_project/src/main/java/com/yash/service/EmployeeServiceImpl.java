package com.yash.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.dao.EmployeeDao;
import com.yash.pojos.Employee;

@Service("employee_service")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee findByEmployeeId(int employeeId) {

		return employeeDao.findByEmployeeId(employeeId);
	}

	@Override
	public String editEmployee(Employee employee) {

		return employeeDao.editEmployee(employee);
	}

	@Override
	public String deleteEmployee(int employeeId) {

		return employeeDao.deleteEmployee(employeeId);
	}

	@Override
	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.findAllEmployee();
	}

	@Override
	public String saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.saveEmployee(employee);
	}
}
