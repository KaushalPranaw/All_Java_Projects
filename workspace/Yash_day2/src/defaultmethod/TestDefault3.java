package defaultmethod;

interface I3
{
	 
	default void m3() //it is default bcz it has default implementation
	{
		System.out.println("default method");
	}
	
	/*default int hashCode()  //error ayegi
	{
		return 10;
	}*/
	
	/*int hashCode();  //no error */
	 
	
}

 

public class TestDefault3 implements I3 {

	@Override
	public void m3() {
		 System.out.println("override default");
	}

	public static void main(String[] args) {
		TestDefault3 t=new TestDefault3();
		t.m3();
	}
}
