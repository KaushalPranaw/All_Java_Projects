package com.yash.service;

import java.util.List;

import com.yash.pojos.Student;

public interface StudentService {

	 List<Student> getAllStudent();
	 void deleteStudent(Student s);
	 void updateStudent(Student s);
	 void createStudent(Student s);
	 
	 Student getById(int id);
}
