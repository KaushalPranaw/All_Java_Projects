package PredeinedFI;
import java.util.ArrayList; 
import java.util.function.*;
 
class Employee
{
	  String name;
	  double salary;
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
}
public class TestPredicate4 {
	 
	public static void main(String[] args) {
		 
		 ArrayList<Employee> a=new ArrayList<>();
		 a.add(new Employee("aaaa", 100));
		 a.add(new Employee("aaaab", 5500));
		 a.add(new Employee("aaacccccca", 10330));
		 a.add(new Employee("aaaaddddd", 1002));
		 a.add(new Employee("aaazzzzzzzzzza", 1100));
		 
		 //check whether salary greater than 3000 or not
		 Predicate<Employee> p=e->e.salary>3000;//we can add any times condition here
		 for(Employee e:a)
		 {
			 if(p.test(e))
				 System.out.println(e);
		 }
	}

}
