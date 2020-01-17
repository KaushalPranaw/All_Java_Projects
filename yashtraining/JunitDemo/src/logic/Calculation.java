package logic;

public class Calculation {

	public static int findMax(int a[])
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
				max=a[i];
		}
		return max;
	}
	public static int cube(int n)
	{
		return n*n*n;
	}
	
	public static String reverseWord(String s)
	{
		StringBuilder sb=new StringBuilder();
		sb.append(s).reverse();
		return sb.toString();
	}
	
}
