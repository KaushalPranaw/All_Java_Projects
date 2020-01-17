package PredeinedFI_twoargument;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

class Employee
{
	int eno;
	String name;
	public Employee(int eno, String name) {
		 
		this.eno = eno;
		this.name = name;
	}
	
}

public class TestBiFunction1 {

	public static void main(String[] args) {
		 BiFunction<Integer, String, Employee> bf=(eno,name)->new Employee(eno, name);
		 ArrayList<Employee> a=new ArrayList<>();
		 a.add(bf.apply(2, "b"));
		 a.add(bf.apply(1, "baa"));
		 a.add(bf.apply(22, "aab"));
		 
		 for(Employee e:a)
		 {
			 System.out.println(e.eno+":"+e.name);
		 }
		 
	}
}
