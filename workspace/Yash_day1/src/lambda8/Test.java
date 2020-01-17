package lambda8;

import java.util.ArrayList;
import java.util.Collections; 

class Employee
{
	String name;
	int eno;
	public Employee(String name, int eno) {
		super();
		this.name = name;
		this.eno = eno;
	}
	@Override
	public String toString() {
		return  name+":" +   eno  ;
	}
	 
	
	
}
public class Test {
	
	public static void main(String[] args) {
		Employee e=new Employee("Pranaw", 100);
		System.out.println(e);
		
		ArrayList<Employee> l=new ArrayList<>();
		l.add(new Employee("a", 11111));
		l.add(new Employee("a", 12));
		l.add(new Employee("c", 5));
		l.add(new Employee("d", 111));
		System.out.println(l);
		 
		
		
		Collections.sort(l, (a,b)->(a.eno<b.eno)?-1:((a.eno>b.eno)?+1:0));
		System.out.println(l);
		Collections.sort(l, (a,b)->a.name.compareTo(b.name));
		System.out.println(l);
		
	}

}
