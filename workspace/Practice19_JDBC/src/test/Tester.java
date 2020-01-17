package test;

import java.sql.Date;
import java.util.Scanner;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import pojo.Employee;

public class Tester {

	public static void main(String[] args) throws Exception {
		EmployeeDao dao=null;
		try(Scanner sc=new Scanner(System.in))
		{
			dao=new EmployeeDaoImpl();
			boolean exit=false;
			while(!exit)
			{
				try
				{
					System.out.println("Enter "
							+ "\n1 : Fetch emp details"
							+ "\n2 : Hire emp"
							+ "\n3 : update"
							+ "\n4 : exit");
					System.out.println("Enter your choice");
					switch(sc.nextInt())
					{
						case 1:
							System.out.println("Enter joining date");
							dao.getEmpDetails(sc.next()).forEach(System.out::println);
							System.out.println();
							break;
						case 2:
							System.out.println("Enter emp name addess date sal");
							String s=dao.hireEmp(new Employee(sc.next(), sc.next(),Date.valueOf(sc.next()), sc.nextDouble()));
							System.out.println(s);
							System.out.println();
							break;
						case 3:
							System.out.println("Enter id and inc");
							System.out.println(dao.updateEmp(sc.nextInt(), sc.nextDouble()));
							System.out.println();
							break;
						case 4:
							exit=true;
							break;
						default:
							System.out.println("Wrong choice please try again");
							System.out.println();
							break;
						
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}
}
