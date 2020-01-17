package com.yash.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yash.pojos.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Employee findByEmployeeId(int employeeId) {
		
		Employee employee = (Employee) sessionFactory.getCurrentSession().get(Employee.class, employeeId);
		 
		return employee;
	}

	@Override
	public String editEmployee(Employee employee) {

		sessionFactory.getCurrentSession().update(employee);
		return "updated employee with id : " + employee.getEmployeeId();
	}

	@Override
	public String deleteEmployee(int employeeId) {

		sessionFactory.getCurrentSession().delete(findByEmployeeId(employeeId));
		return "Employee with id : " + employeeId + " deleted !";
	}

	 
	@SuppressWarnings("unchecked")
	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("select e from Employee e").list();
	}

	@Override
	public String saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(employee);
		return "Employee Saved with id "+employee.getEmployeeId();
	}
}
