package defaultmethod;

class P1
{
	public void m1() {
		 System.out.println("p1 method");

	}
}
class P2
{
	public void m2() {
		 System.out.println("p2 method");

	}
}
 

public class TestDefault4 extends P1/*,P2 */{ // compiler unable to find which method we have to call bcz of same method so java does not support

	public static void main(String[] args) {
		TestDefault4 t=new TestDefault4();
		t.m1();
	}
	 
}
// now see TestDefault5 wali class