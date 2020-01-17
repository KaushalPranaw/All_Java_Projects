package stream;

import java.util.ArrayList;
import java.util.List;
import lambda.Employee;

public class TestStream {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "pranaw", 81000.0));
		empList.add(new Employee(3, "ram", 31000.0));
		empList.add(new Employee(2, "rahul", 31000.0));
		empList.add(new Employee(11, "naresh", 110001.0));

		empList.stream()
				.filter(emp->emp.getName().startsWith("r"))
				.sorted((e1, e2) -> ((Double) (e1.getSalary())).compareTo(e2.getSalary()))
				.forEach(System.out::println);
	}
}
