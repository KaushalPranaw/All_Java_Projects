package basic;

public class MoveUpperAtLast {

	public static void main(String[] args) {
		String s="Pranaw is a goof Boy";
		System.out.println(move(s));
		
	}

	private static String move(String s) {
		String u="";
		String r="";
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
				u+=s.charAt(i);
			else
				r+=s.charAt(i);
		}
		return r+u;
		
	}
}
