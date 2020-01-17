package com.yash.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.dao.StudentDao;
import com.yash.pojos.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao dao;
	
	@Override
	public List<Student> getAllStudent() {
		
		return dao.getAllStudent();
	}

	@Override
	public void deleteStudent(Student s) {
		dao.deleteStudent(s);
		
	}

	@Override
	public void updateStudent(Student s) {
		dao.updateStudent(s);
		
	}

	@Override
	public void createStudent(Student s) {
		dao.createStudent(s);
		
	}

	@Override
	public Student getById(int id) {
		
		return dao.getById(id);
	}

	
}
