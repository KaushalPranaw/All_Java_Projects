package buffer;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestWrite {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("./src/f1.txt")))
		{
			String s="pranaw kaushal";
			byte[] b=s.getBytes();
			bos.write(b);
			bos.write(10);
			System.out.println("sent");
		}
	}
}
