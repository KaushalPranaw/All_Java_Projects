package core;

public class Mgr extends Emp {

	private double salary;

	public Mgr(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	 
	 
	
}
