package programs;

public class Reverse {
	public static void main(String[] args) {
		String s="pranaw";
		/*StringBuilder s1=new StringBuilder(s);
		s1.reverse();
		System.out.println(s1);*/
		char c1[]=new char[s.length()];
		int i=s.length()-1;
		for(char c: s.toCharArray())
		{
			
			c1[i--]=c;
			
		}
		for(char c:c1)
		{
			System.out.print(c+"");
		}
	}
}
