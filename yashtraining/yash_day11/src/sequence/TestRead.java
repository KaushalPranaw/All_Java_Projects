package sequence;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class TestRead {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try(FileInputStream in1=new FileInputStream("./src/f1.txt");
				FileInputStream in2=new FileInputStream("./src/f2.txt");
				SequenceInputStream sis=new SequenceInputStream(in1,in2))
		{
			int i=0;
			while((i=sis.read())!=-1)
				System.out.print((char)i);
		}
	}
}
