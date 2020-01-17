package datastream;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.app.core.Customer;

public class TestRead {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File("./src/data.txt");
		List<Customer> l=new ArrayList<>();
		try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
			//int t=dis.available();
			//System.out.println(t);
			if(file.exists()&&file.isFile()&&file.canRead())
			{
				try
				{
					while(true)
					{
						l.add(new Customer(dis.readInt(), dis.readUTF(), dis.readDouble()));
					}
				}
				catch (EOFException e) {
					// TODO: handle exception
				}
				
				
			}
			l.forEach(System.out::println);
		}
	}
}
