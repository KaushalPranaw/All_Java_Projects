package dao;

import java.util.List;

import pojo.Employee;

public interface EmployeeDao {

	List<Employee> getEmpDetails(String joiningDate) throws Exception;
	String hireEmp(Employee e) throws Exception;
	String updateEmp(int id,double inc) throws Exception;
	
}
