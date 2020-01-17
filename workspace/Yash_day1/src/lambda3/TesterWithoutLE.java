package lambda3;

 
class Demo implements TestFI
{

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}
	
}
public class TesterWithoutLE {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.add(2, 3);
		
			//or
		/*TestFI t=new Demo();
		t.m1();*/
				
	}
}
