package com.yash.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yash.pojos.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private SessionFactory sf;

	@Override
	public List<Student> getAllStudent() {
	
		return sf.getCurrentSession().createQuery("select s from Student s", Student.class).getResultList();
		
	}

	@Override
	public void deleteStudent(Student s) {
		sf.getCurrentSession().delete(s);
		
	}

	@Override
	public void updateStudent(Student s) {
		sf.getCurrentSession().update(s);
		
	}

	@Override
	public void createStudent(Student s) {
		sf.getCurrentSession().save(s);
		
	}

	@Override
	public Student getById(int id) {
		
		return sf.getCurrentSession().get(Student.class, id);
	}

}
