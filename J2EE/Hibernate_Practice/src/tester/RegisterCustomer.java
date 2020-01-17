package tester;
 
import java.text.SimpleDateFormat;
import java.util.Scanner;

import dao.CustomerDaoImpl;
import pojos.Customer;
import pojos.CustomerType;

import static utils.HibernateUtils.*;
public class RegisterCustomer {

	public static void main(String[] args)   {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		try(Scanner sc=new Scanner(System.in))
		{
			getSf();
			System.out.println("sf created");
			System.out.println("Enter cust details");
			System.out.println("name,email,pass,role,amt,date,type");
			Customer c1= new Customer(sc.next(), sc.next(), sc.next()
					, sc.next(), sc.nextDouble(), sdf.parse(sc.next()), CustomerType.valueOf(sc.next().toUpperCase()));
			System.out.println(c1);
			System.out.println(new CustomerDaoImpl().registerCustomer(c1));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			getSf().close();
			System.out.println("SF cleaned up...");
		}
	}
}
