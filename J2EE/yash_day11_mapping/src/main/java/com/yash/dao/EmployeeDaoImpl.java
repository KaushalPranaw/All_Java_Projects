package com.yash.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yash.pojos.Contact;
import com.yash.pojos.Course;
import com.yash.pojos.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public String register(Employee e) {
		System.out.println("register() called");
		e.addAddress(e.getAddress());
		
		/*for(Contact c:e.getContactList())
		{
			e.addContact(c);
		}
		for(Course c:e.getCourseList())
		{
			e.addCourse(c);
		}*/

		e.addContact(e.getContactList().get(0));
		e.addContact(e.getContactList().get(1));

		/*Course c1 = e.getCourseList().get(0);
		Course c2 = e.getCourseList().get(1);
		e.addCourse(c1);*/
		//e.addCourse(null);

		System.out.println(e);
		sf.getCurrentSession().save(e);

		return "saved with id" + e.getId();
	}
 
	 

	
	@Override
	public List<Employee> getAll() {
		System.out.println("getAll() called");
		ArrayList<Employee> emps= (ArrayList<Employee>) sf.getCurrentSession().createQuery("select distinct e from Employee e left join fetch e.contactList", Employee.class).getResultList();
	
		System.out.println(emps);
		//System.out.println(emps);
		return emps;
	}



	@Override
	public Employee getEmpById(Integer id) {
		System.out.println("getEmpById() called");
		return sf.getCurrentSession().createQuery("select e from Employee e join fetch e.contactList where e.id=:id", Employee.class)
				.setParameter("id", id).getSingleResult();
	}




	@Override
	public String deleteEmployee(int id) {
		System.out.println("deleteEmployee() called");
		sf.getCurrentSession().delete(getEmpById(id));
		return "Employee with id "+ id +" deleted";
	}




	@Override
	public String updateEmployee(Employee e) {
		System.out.println("updateEmployee() called");
		e.addAddress(e.getAddress());
		
		e.addContact(e.getContactList().get(0));
		e.addContact(e.getContactList().get(1));

		Course c1 = e.getCourseList().get(0);
		Course c2 = e.getCourseList().get(1);
		e.addCourse(c1);
		e.addCourse(c2);

		System.out.println(e);
		sf.getCurrentSession().update(e);

		return "Employee with id "+ e.getId() + " is updated";
	}




	@Override
	public List<Course> viewAllCourse() {
		System.out.println("viewAllCourse() called");
		return sf.getCurrentSession().createQuery("select c from Course c", Course.class).getResultList();
	}




	@Override
	public String updateCourseByEmp(List<Course> sortlistedCOurse, int emp_id) {
		System.out.println("updateCourseByEmp() called");
	
		Employee e=sf.getCurrentSession().get(Employee.class, emp_id);
		List<Employee> empsList=new ArrayList<>();
		empsList.add(e);
	
		//e.getCourseList().addAll(sortlistedCOurse);
		/*e.getCourseList().forEach(a->{
			a.setEmpSet(empsList);
		});*/
	
		Iterator<Course> itr=sortlistedCOurse.iterator();
		while(itr.hasNext()) {
			e.addCourse(itr.next());
			
		}
		
		
		sf.getCurrentSession().merge(e);
		
		return "updated with id "+e.getId();
	}

	 
	
	
}
