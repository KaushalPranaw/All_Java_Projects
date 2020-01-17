package tester;

import java.util.Scanner;

import com.app.core.Employee;

import exec.*;

public class TestEmp {

	public static void main(String[] args) {
		int id;
		Employee[] employees = new Employee[20];
		try (Scanner scanner = new Scanner(System.in)) {
			boolean exit = true;
			while (exit) {
				System.out.println("Enter");
				System.out.println("1. accept" + "\n2. Search" + "\n3. Display\n4. Exit");
				System.out.println("choose your option");
				try {
					switch (scanner.nextInt()) {
					case 1:

						System.out.println("enter id name salary");
						id=scanner.nextInt();
						Employee employee = new Employee(id, scanner.next(), scanner.nextDouble());
						try {
							if(find(employees, id)!=null)
								throw new EmpAlreadyExistException("emp already exist");
							else
							{
								for (int i = 0; i < employees.length; i++) {
									if (employees[i] == null) {
										employees[i] = employee;
										System.out.println("inserted");
										break;
									}
								}
							}
							

						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
						break;

					case 2:
						System.out.println("Enter id to find emp");
						 id = scanner.nextInt();
						if (find(employees, id) != null)
							System.out.println(find(employees, id));
						else
						{
							throw new EmpNotFoundException("id does not exist");
						}
						System.out.println();
						break;
					case 3:
						if (employees[0] == null)
							throw new EmpNotFoundException("empty list");
						for (Employee e : employees) {

							if (e != null)
								System.out.println(e);
						}

						break;
					case 4:
						exit = false;
						System.out.println("terminated");
						break;
					default:
						System.out.println("wrong option\n plese try again");
						break;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

		}
	}

	static Employee find(Employee[] emps, int id) throws EmpNotFoundException {
	//	System.out.println("id : " + id);
		Employee emp = null;
		for (Employee e : emps) {
			if (e != null) {
				if (e.getId() == id)
					emp = e;
			}

		}
		

		return emp;
	}
}
