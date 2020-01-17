package lambda;

import java.util.*;

public class EmpTesterUsingLambda {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "pranaw", 81000.0));
		empList.add(new Employee(3, "ram", 31000.0));
		empList.add(new Employee(2, "rahul", 31000.0));
		empList.add(new Employee(11, "naresh", 110001.0));

		Collections.sort(empList, (e1, e2) -> ((Integer) (e1.getId())).compareTo(e2.getId()));
		// empList.forEach(System.out::println);

		Collections.sort(empList, (e1, e2) -> ((Double) (e1.getSalary())).compareTo(e2.getSalary()));
		empList.forEach(System.out::println);
	}
}
