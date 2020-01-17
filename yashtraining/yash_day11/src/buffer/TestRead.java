package buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class TestRead {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream("./src/f1.txt")))
		{
			int i=0;
			while((i=bis.read())!=-1)
				System.out.print((char)i);
		}
	}
}
