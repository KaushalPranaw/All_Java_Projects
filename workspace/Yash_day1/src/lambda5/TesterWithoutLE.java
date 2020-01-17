package lambda5;

 
class Demo implements TestFI
{

	 

	@Override
	public int square(int n) {
		// TODO Auto-generated method stub
		return n*n;
	}
	
}
public class TesterWithoutLE {

	public static void main(String[] args) {
		Demo d=new Demo();
		System.out.println(d.square(3));
		
			//or
		/*TestFI t=new Demo();
		t.m1();*/
				
	}
}
