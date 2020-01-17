package datastream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.app.core.Customer;

public class TestWrite {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<Customer> l=new ArrayList<>();
		l.add(new Customer(1, "abc", 100));
		l.add(new Customer(2, "absc", 1200));
		l.add(new Customer(3, "addbc", 1300));
		l.add(new Customer(4, "abcd", 1050));
		File f=new File("./src/fo.txt");
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream(f)))
		{
			if(f.exists()&&f.canWrite()&&f.isFile())
			{
				for(Customer c:l)
				{
					dos.writeInt(c.getId());			
					dos.writeUTF(c.getName());
					dos.writeDouble(c.getSalary());
				}
				
			}
			
			System.out.println("sent");
		}
	}
}
