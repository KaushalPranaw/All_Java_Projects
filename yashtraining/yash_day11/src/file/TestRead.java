package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestRead {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileInputStream fos=new FileInputStream("./src/f2.txt"))
		{
			int i=0;
			while((i=fos.read())!=-1)
				System.out.print((char)i);
		}
	}
}
