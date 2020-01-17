package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class TestWrite {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File f=new File("./src/file.txt");
		try(FileWriter fw=new FileWriter(f))
		{
			String s="pranaw";
			fw.write(s);
			System.out.println("sent");
		}
	}
}
