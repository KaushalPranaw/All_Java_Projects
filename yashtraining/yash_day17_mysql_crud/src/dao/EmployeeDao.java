package dao;

import java.util.List;

import pojos.Employee;

public interface EmployeeDao {

	List<Employee> getEmployeeDetails(String joiningdate) throws Exception;

	void addEmployee(Employee e)throws Exception;

	void deleteEmployeeById(int id)throws Exception;

	void updateEmployee(int id, int increment)throws Exception;
}
