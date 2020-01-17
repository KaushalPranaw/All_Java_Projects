package defaultmethod;

interface I
{
	 
	default void m3() //it is default bcz it has default implementation
	{
		System.out.println("default method");
	}
} 

public class TestDefault implements I {

	public static void main(String[] args) {
		TestDefault t=new TestDefault();
		t.m3();
	}
}
