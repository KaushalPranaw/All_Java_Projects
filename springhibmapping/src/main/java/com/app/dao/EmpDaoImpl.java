package com.app.dao;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.model.Contact;
import com.app.model.Employee;



@Repository
public class EmpDaoImpl implements EmpDao {

	@Autowired
	SessionFactory sf;
	@SuppressWarnings("unchecked")
	public List<Employee> findAllEmp() {
		
		System.out.println("first");
		String jpql="select distinct e from Employee e JOIN FETCH e.course";
		
		 String hql = "from Employee";
	  

		return  sf.getCurrentSession().createQuery(jpql).list();
		
	}
	@Override
	public void deleteEmployeeById(int id) {
	
		
		
		Employee e=(Employee) sf.getCurrentSession().get(Employee.class, id);
       
      e.removeAddress(e.getAddress());
      e.removeContact(e.getContactList().get(0));
      e.removeCourse(e.getCourse().get(0));
      sf.getCurrentSession().delete(e);
       
	}
	@Override
	public void saveEmployee(Employee employee) {
	
		employee.addAddress(employee.getAddress());
		employee.addContact(employee.getContactList().get(0));
		employee.addCourse(employee.getCourse().get(0));
		sf.getCurrentSession().save(employee);
	}
	
	@Override
	public Employee findEmployeeById(int id)
	{
		Employee e=(Employee) sf.getCurrentSession().get(Employee.class, id);
		System.out.println(e);
		System.out.println(e.getAddress());
		System.out.println(e.getContactList());
		System.out.println(e.getCourse());
		return e;
	}
	
	@Override
	public void updateEmployee(Employee employee) {
		
		employee.addAddress(employee.getAddress());
		employee.addContact(employee.getContactList().get(0));
		employee.addCourse(employee.getCourse().get(0));
		sf.getCurrentSession().update(employee);
		
	}
	
	
	
	

}
