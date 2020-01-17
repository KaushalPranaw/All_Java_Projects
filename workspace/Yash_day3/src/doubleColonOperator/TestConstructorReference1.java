package doubleColonOperator;


class Sample
{
	public Sample() {
		System.out.println("sample class cons executed");
	}
}

interface InterfForCR
{
	public Sample get();
}

public class TestConstructorReference1 {

	public static void main(String[] args) {
		InterfForCR interf=Sample::new;
		Sample sample1=interf.get();
		Sample sample2=interf.get();
		Sample sample3=interf.get();
		
		
	}
	
}
