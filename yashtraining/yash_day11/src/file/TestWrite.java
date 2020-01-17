package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestWrite {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileOutputStream fos=new FileOutputStream("./src/f2.txt"))
		{
			String s="kaushal";
			byte[] b=s.getBytes();
			fos.write(b);
			System.out.println("sent");
		}
	}
}
