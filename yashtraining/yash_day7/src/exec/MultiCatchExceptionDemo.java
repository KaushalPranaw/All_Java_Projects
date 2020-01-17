package exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultiCatchExceptionDemo {

	public static void main(String[] args) {
		try {
			show();
		} catch (FileNotFoundException | NullPointerException e) {
			if (e.getClass().getName().equals("java.io.FileNotFoundException"))
				System.out.println("java.io.FileNotFoundException");
			if (e.getClass().getName().equals("java.lang.NullPointerException")) {
				System.out.println("NullPointerException");
			}
		}

	}

	public static void show() throws FileNotFoundException, NullPointerException {
		System.out.println("in show()");
		// FileInputStream fis=new FileInputStream("ffff");

		String s = null;
		System.out.println(s.length());
	}
}
