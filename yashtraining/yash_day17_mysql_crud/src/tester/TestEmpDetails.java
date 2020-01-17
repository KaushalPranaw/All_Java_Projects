package tester;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.EmpDaoImpl;
import dao.EmployeeDao;
import pojos.Employee;

public class TestEmpDetails {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		EmployeeDao dao = new EmpDaoImpl();

		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("Click \n" + "1. Employee based on joining date\n" + "2. Add Employee\n"
							+ "3. Update Employee\n" + "4. Delete Employee\n" + "10. Exit\n" + "Enter Your choice");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter joining date");
						List<Employee> empList = dao.getEmployeeDetails(sc.next());
						empList.forEach(System.out::println);
						break;

					case 2:
						System.out.println("Enter emp details");
						dao.addEmployee(new Employee(sc.next(), sc.nextDouble(), Date.valueOf(sc.next())));
						break;

					case 3:
						System.out.println("Enter id and increment to update ");
						dao.updateEmployee(sc.nextInt(), sc.nextInt());
						break;

					case 4:
						System.out.println("Enter id to delete");
						dao.deleteEmployeeById(sc.nextInt());
						break;

					case 10:
						System.out.println("exiting................10");
						exit = true;
						break;

					default:
						System.out.println("Wrong choice please try again");
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			System.out.println();
		}

	}
}
