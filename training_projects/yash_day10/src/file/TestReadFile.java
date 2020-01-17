package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestReadFile  {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileInputStream fis=new FileInputStream("./file.txt"))
		{
			int i=0;
			while((i=fis.read())!=-1)
			 System.out.print((char)fis.read());
		}
		Arrays.
	}
}
