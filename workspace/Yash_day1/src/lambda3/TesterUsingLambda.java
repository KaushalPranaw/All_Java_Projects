package lambda3;
 

public class TesterUsingLambda {

	public static void main(String[] args) {
		
		TestFI t=(a,b)->System.out.println(a+b);
		t.add(2, 3);
		t.add(2, 32);
		t.add(2, 322);
		 
	}
}
