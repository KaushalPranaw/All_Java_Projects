package lambda4;

 
class Demo implements TestFI
{

	@Override
	public int add(int a, int b) {
		return a+b;
	}
	
}
public class TesterWithoutLE {

	public static void main(String[] args) {
		Demo d=new Demo();
		System.out.println(d.add(2, 3));
		
			//or
		/*TestFI t=new Demo();
		t.m1();*/
				
	}
}
