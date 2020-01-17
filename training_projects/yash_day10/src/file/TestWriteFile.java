package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestWriteFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileOutputStream fos=new FileOutputStream("./file.txt"))
		{
			String s="pranawkaushal";
			fos.write(s.getBytes());
			System.out.println("sent");
		}
	}
}
