package basic;

public class Reverse {

	public static void main(String[] args) {
		/*String s = "madaa";
		String r = new StringBuffer(s).reverse().toString();
		if(s.equals(r))
			System.out.println("YES");
		else
			System.out.println("NO");*/
		
		String s="this is javatpoint";
		String r=new StringBuilder(s).reverse().toString();
		System.out.println(r);
		r="";
		for(int i=s.length()-1;i>=0;i--)
		{
			r+=s.charAt(i);
		}
		System.out.println(r);
		
		//reverse each word
		
		String sp[]=s.split(" ");
		String op="";
		for(String s1:sp)
		{
			op+=new StringBuilder(s1).reverse().toString()+" ";
		}
		System.out.println(op);
	}
}
