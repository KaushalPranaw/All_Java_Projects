package tester;

public class Tester {

	public static void main(String[] args) {
		int i=0;
		
		for(i=1;i<=15;i++)
		{	
			assert(i>10);
			System.out.println(i);
		}
	}
}
