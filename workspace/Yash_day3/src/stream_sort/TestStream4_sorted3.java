package stream_sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;  

class Employee
{
	int employeeId;
	String employeeName;
	double employeeSalary;
	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	
	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public double getEmployeeSalary() {
		return employeeSalary;
	}


	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}	
	
}
public class TestStream4_sorted3 {

	public static void main(String[] args) {
		 ArrayList<Employee> employees=new ArrayList<>();
		 employees.add(new Employee(1, "pranaw", 1000.0));
		 employees.add(new Employee(2, "pavan", 100.0));
		 employees.add(new Employee(3, "shubham", 10200.0));
		 employees.add(new Employee(4, "raj", 100.0));
		 System.out.println(employees);
		 
		// List<Employee> sortedEmployees= employees.stream().sorted((i1,i2)->((Double)i1.employeeSalary).compareTo(i2.employeeSalary)).collect(Collectors.toList());
		 
		/*
		 * Comparator<Employee> c=(e1,e2)->{ if(e1.employeeSalary==e2.employeeSalary)
		 * return e1.employeeName.compareTo(e2.employeeName); return
		 * ((Double)e2.employeeSalary).compareTo(e2.employeeSalary); };
		 */
		 List<Employee> sortedEmployees=employees.stream().sorted((e1,e2)->{
				if(e1.getEmployeeSalary()==e2.getEmployeeSalary())
					return e1.getEmployeeName().compareTo(e2.getEmployeeName());
				return ((Double)e2.getEmployeeSalary()).compareTo(e2.getEmployeeSalary());
			 }).collect(Collectors.toList());
		 
		 System.out.println(sortedEmployees);
	}
}
