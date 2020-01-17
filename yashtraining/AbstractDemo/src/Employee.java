
public abstract class Employee {
	int id;
	String name;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	static void display()
	{
		System.out.println("display()");
	}
	
	public abstract void calSal();
	public static void main(String[] args) {
		Employee.display();
	}
}
