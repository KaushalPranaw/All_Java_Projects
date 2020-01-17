package externlize;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.app.core.Employee;

public class TestWrite {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File f=new File("./src/fe.txt");
		List<Employee> l=new ArrayList<>();
		l.add(new Employee(1, "abc", 100));
		l.add(new Employee(2, "absc", 1200));
		l.add(new Employee(3, "addbc", 1300));
		l.add(new Employee(4, "abcd", 1050));
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f)))
		{
			if(f.exists()&&f.canWrite()&&f.isFile())
			{
				for(Employee e:l)
					oos.writeObject(e);
			}
			System.out.println("sent");
		}
	}
}
