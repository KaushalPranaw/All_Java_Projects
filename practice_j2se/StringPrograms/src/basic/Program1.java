package basic;

public class Program1 {

	public static void main(String[] args) {
		char c[]= {'p','r','a','n','a','w'};
		String s = new String(c);
		System.out.println(s);
		
		String s1= "pranaw";
		String s2="kaushal";
		System.out.println(s2.compareTo(s1.substring(0,2)));		
		System.out.println(s1);
	}
}
