package com.yash.dao;

import java.util.List;

import com.yash.pojos.Student;

public interface StudentDao {

	 List<Student> getAllStudent();
	 void deleteStudent(Student s);
	 void updateStudent(Student s);
	 void createStudent(Student s);
	 
	 Student getById(int id);
	 
}
