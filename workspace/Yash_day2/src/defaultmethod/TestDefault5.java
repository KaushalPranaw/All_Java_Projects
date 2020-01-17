package defaultmethod;

interface Left
{
	default void m1() {
		 System.out.println("Left m1 method");

	}
}
interface Right
{
	default void m1() {
		 System.out.println("Right m1 method");

	}
}
 

public class TestDefault5 implements Left,Right  {
	
	/*public void m1()
	{
		System.out.println("own method");
	}*/
	
	/*//to call left default method
	public void m1()
	{
		 Left.super.m1();
	}*/
	
	
	//to call right default method
		public void m1()
		{
			 Right.super.m1();
		}
	
	
	public static void main(String[] args) {
		 TestDefault5 t=new TestDefault5();
		 t.m1();
	}
	 
}