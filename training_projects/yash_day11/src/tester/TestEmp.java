package tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import core.Employee;

public class TestEmp {

	public static void main(String[] args) {
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(new Employee(1, "pranaw", 1000));
		emps.add(new Employee(11, "pawan", 1500));
		emps.add(new Employee(5, "raj", 10000));
		emps.add(new Employee(3, "shubham", 11000));
		emps.add(new Employee(2, "siddhant", 21000));
		Collections.sort(emps);

		Collections.sort(emps, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				if (o1.getSalary().equals(o2.getSalary()))
					return o1.getName().compareTo(o2.getName());
				return o1.getSalary().compareTo(o2.getSalary());

			}
		});

		emps.forEach(System.out::println);

	}
}
