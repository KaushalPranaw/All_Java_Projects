package file;

import java.io.File;

public class TestFile {

	public static void main(String[] args) {
		File f=new File("./src/file.ser");
		System.out.println(f.exists());
		System.out.println(f.canRead());
		System.out.println(f.isFile());
		System.out.println(f.length());
		System.out.println(f.getFreeSpace());
	}
}
