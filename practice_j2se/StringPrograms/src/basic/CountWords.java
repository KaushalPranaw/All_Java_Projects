package basic;

public class CountWords {

	public static void main(String[] args) {
		String s=" a India  Is           My Country";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if((i==0&&c!=' ')||(i>0&&c!=' '&&s.charAt(i-1)==' '))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
