package externlize;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.app.core.Employee;

public class TestRead {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File("./src/fe.txt");
		List<Employee> l=new ArrayList<>();
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file)))
		{
			if(file.exists()&&file.isFile()&&file.canRead())
			{
				try
				{
					while(true)
					{
						System.out.println(ois.readObject());
						l.add((Employee) ois.readObject());
					}
				}
				catch (EOFException e) {
					// TODO: handle exception
				}
			}
			System.out.println(l);
		}
		
	}
}
