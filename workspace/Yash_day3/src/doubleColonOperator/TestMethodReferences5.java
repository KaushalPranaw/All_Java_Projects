package doubleColonOperator;

interface Interf
{
	public void add(int a,int b);
}

public class TestMethodReferences5 {

	public static void sum(int x,int y)
	{
		System.out.println("sum : "+(x+y));
	}
	
	public static void main(String[] args) {
		/*Interf interf=(a,b)->System.out.println("Sum : "+(a+b));*/
		
		Interf interf=TestMethodReferences5::sum;
		
		interf.add(3, 5);
	}
}
