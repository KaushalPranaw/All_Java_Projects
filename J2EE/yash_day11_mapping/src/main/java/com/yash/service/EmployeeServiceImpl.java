package com.yash.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import org.springframework.transaction.annotation.Transactional;
import com.yash.dao.EmployeeDao;
import com.yash.pojos.Course;
import com.yash.pojos.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public String register(Employee e) {
		// TODO Auto-generated method stub
		return dao.register(e);
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public Employee getEmpById(Integer id) {
		// TODO Auto-generated method stub
		return dao.getEmpById(id);
	}

	@Override
	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(id);
	}

	@Override
	public String updateEmployee(Employee e) {
		return dao.updateEmployee(e);
	}

	@Override
	public List<Course> viewAllCourse() {
		// TODO Auto-generated method stub
		return dao.viewAllCourse();
	}

	@Override
	public String updateCourseByEmp(List<Course> sortlistedCOurse, int emp_id) {
		// TODO Auto-generated method stub
		return dao.updateCourseByEmp(sortlistedCOurse, emp_id);
	}


}
