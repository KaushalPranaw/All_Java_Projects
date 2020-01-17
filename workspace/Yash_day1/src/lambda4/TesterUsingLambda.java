package lambda4;

public class TesterUsingLambda {

	public static void main(String[] args) {
		
		TestFI t=(a,b)->a+b;
		System.out.println(t.add(4, 3));
	}
}
