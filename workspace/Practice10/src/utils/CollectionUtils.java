package utils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import static com.app.core.Customer.*;
import com.app.core.Customer;

public class CollectionUtils {

	public  static List<Customer> populateData()
	{
		List<Customer> l=new ArrayList<>();
		
		 try {
			l.add(new Customer("a", "a", 100, sdf.parse("1-1-2018")));
			l.add(new Customer("b", "a", 400, sdf.parse("2-1-2018")));
			l.add(new Customer("c", "a", 200, sdf.parse("3-1-2018")));
			l.add(new Customer("d", "a", 300, sdf.parse("4-1-2018")));
			l.add(new Customer("e", "a", 500, sdf.parse("5-1-2018")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
	
	public static String registerCustomer(List<Customer> ll,Customer c)
	{
		ll.add(c);
		return "registered successfully";
	}
}
