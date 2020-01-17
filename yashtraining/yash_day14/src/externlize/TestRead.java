package externlize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.app.core.Customer;

public class TestRead {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File("./src/fo.txt");
		List<Customer> l=new ArrayList<>();
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file)))
		{
			if(file.exists()&&file.isFile()&&file.canRead())
			{
				@SuppressWarnings("unchecked")
				ArrayList<Customer> readObject = (ArrayList<Customer>)ois.readObject();
				l=readObject;
			}
			System.out.println(l);
		}
	}
}
