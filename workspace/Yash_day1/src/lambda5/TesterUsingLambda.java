package lambda5;

public class TesterUsingLambda {

	public static void main(String[] args) {
		
		TestFI t=n->n*n;
		System.out.println(t.square(5));
	}
}
