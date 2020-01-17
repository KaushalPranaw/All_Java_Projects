package delta;


public class EmployeeBusinessLogic {

	

	public double annualSalary(Employee employee)
	{
		return employee.getSalary()*12;
	}
	
	
	public double appraisal(Employee employee)
	{
		if(employee.getSalary()>10000)
			return 1000.0;
		else
			return 500.0;
	}
	
	
}
