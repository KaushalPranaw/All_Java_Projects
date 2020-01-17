package com.yash.service;

import java.util.List;

import com.yash.pojos.Course;
import com.yash.pojos.Employee;

public interface EmployeeService {

	String register(Employee e);
	List<Employee> getAll();
	Employee getEmpById(Integer id);
	String deleteEmployee(int id);
	String updateEmployee(Employee e);
	
	List<Course> viewAllCourse();
	String updateCourseByEmp(List<Course> sortlistedCOurse, int emp_id);

}
