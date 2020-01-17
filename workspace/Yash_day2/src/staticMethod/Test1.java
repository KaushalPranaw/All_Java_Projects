package staticMethod;

interface I
{
	public static void m1()
	{
		System.out.println("interface static method");
	}
}

public class Test1 implements I {

	public static void main(String[] args) {
		I.m1();
		 
		
	}
}
