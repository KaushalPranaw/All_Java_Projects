package stream2_all_any_noneMatch;

import java.util.List;
import java.util.function.Predicate;

public class MatcherDemo {

	public static void main(String[] args) {
		Predicate<Employee> p1=e->e.id<10&&e.name.startsWith("A");
		Predicate<Employee> p2=e->e.sal<10000;
		
		List<Employee> listOfEmployee=Employee.getEmpList();
		 //using allMatch
	    boolean b1 = listOfEmployee.stream().allMatch(p1); 
	    System.out.println(b1);
	    boolean b2 = listOfEmployee.stream().allMatch(p2);
	    System.out.println(b2);
	    //using anyMatch
	    boolean b3 = listOfEmployee.stream().anyMatch(p1);
	    System.out.println(b3);
	    boolean b4 = listOfEmployee.stream().anyMatch(p2);
	    System.out.println(b4);
	    //using noneMatch
	    boolean b5 = listOfEmployee.stream().noneMatch(p1);
	    System.out.println(b5);
	}
	
}
