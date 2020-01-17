package defaultmethod;

interface I1
{
	 
	default void m3() //it is default bcz it has default implementation
	{
		System.out.println("default method");
	}
}

 

public class TestDefault2 implements I1 {

	@Override
	public void m3() {
		 System.out.println("override default");
	}

	public static void main(String[] args) {
		TestDefault2 t=new TestDefault2();
		t.m3();
	}
}
