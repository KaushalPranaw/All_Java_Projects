package tester;

import static utils.CollectionUtils.*;
import static utils.ValidateUtils.*;
import java.util.List;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

import com.app.core.Customer;
public class TestCustomer {

	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in))
		{
			boolean exit=false;
			List<Customer> l=populateData();
			while(!exit)
			{
				try
				{
					System.out.println(""
							+ "1. Register\n"
							+ "2. Fetch Customer\n"
							+ "10. exit\n"
							+ "Choose your option\n");
					
					switch(sc.nextInt())
					{
						case 1:
							System.out.println("Enter email,pass,regamount,date");
							Customer c=new Customer(sc.next(), sc.next(), sc.nextDouble(), validateDate(sc.next()));
							String s=registerCustomer(l,c);
							System.out.println(s);
							break;
							
						case 2:
							System.out.println("All Customer Details:");
							populateData().forEach(System.out::println);
							break;
							
						case 10:
							exit=true;
							break;
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
