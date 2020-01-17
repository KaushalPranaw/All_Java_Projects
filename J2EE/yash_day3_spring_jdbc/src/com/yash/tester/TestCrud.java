package com.yash.tester;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.config.DataSourceConfig;
import com.yash.dao.EmployeeDao;
import com.yash.dao.EmployeeDaoImpl;
import com.yash.pojos.Employee;

public class TestCrud {

	public static void main(String[] args) {
		//ApplicationContext context=new ClassPathXmlApplicationContext("datasource.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(DataSourceConfig.class);
		EmployeeDaoImpl dao=context.getBean("dao",EmployeeDaoImpl.class);
		Scanner sc=new Scanner(System.in);
		boolean exit=true;
		while(exit)
		{
			System.out.println("Enter your option");
			System.out.println("1. Get All Emp\n"
					+ "2. Get ById\n"
					+ "3. Update by Id\n"
					+ "4. Delete by Id\n"
					+ "5. Insert emp\n"
					+ "6. exit\n");
			
			switch (sc.nextInt()) {
			case 1:
				dao.getAllEmp().forEach(System.out::println);
				break;

			case 2:
				System.out.println("Enter Id ");
				Employee employee=dao.getEmpById(sc.nextInt());
				System.out.println(employee);
				break;
			case 3:
				System.out.println("Enter id to update : ");
				 System.out.println(dao.updateEmp(sc.nextInt(), new Employee( sc.next(),sc.nextDouble())));
				break;
			case 4:
				 System.out.println("Enter id to delete : ");
				 System.out.println(dao.deleteEmp(sc.nextInt()));
				break;
			case 5:
				 System.out.println("Enter id name salary");
				 Employee emp=new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
				 System.out.println(dao.insertEmp(emp));
				break;
			case 6:
				exit=false;
				break;
			default:
				System.out.println("wrong choice please try again ");
				break;
			}
		}
		
		if(sc!=null)
			sc.close();
		((AbstractApplicationContext) context).close();
	}
}
