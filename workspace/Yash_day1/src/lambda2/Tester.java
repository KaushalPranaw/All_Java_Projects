package lambda2;

//demo is implementation class
class Demo implements TestFI
{

	@Override
	public void m1() {
		System.out.println("hello.......");
		
	}
	
}

public class Tester {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.m1();
		
			//or
		/*TestFI t=new Demo();
		t.m1();*/
				
	}
}
