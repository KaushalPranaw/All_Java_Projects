package basic;

public class TestString {

	public static void main(String[] args) {
		String s1="pranaw";
		String s3="pranawkaushal";
		String s2=(s1+"kaushal").intern();
		//s2.intern();
		//System.out.println(s1==s2);
		System.out.println(s2==s3);
		
	}
}
