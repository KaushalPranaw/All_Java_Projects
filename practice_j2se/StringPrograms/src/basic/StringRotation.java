package basic;

public class StringRotation {

	public static void main(String[] args) {

		String s1="avajava";
		String s2="javaava";
		
		String s3=s1+s1;
		if(s3.contains(s2))
			System.out.println("yes");
		else
			System.out.println("not");
	}
}
