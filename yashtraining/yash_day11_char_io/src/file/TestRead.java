package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestRead {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File f=new File("./src/file.txt");
		try(FileReader fr=new FileReader(f))
		{
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
	}
}
