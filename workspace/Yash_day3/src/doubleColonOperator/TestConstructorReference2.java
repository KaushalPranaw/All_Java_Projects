package doubleColonOperator;


class Sample1
{
	public Sample1() {
		System.out.println("No args");
	}
	public Sample1(String s) {
		System.out.println("sample class cons executed with arg : "+s);
	}
}

interface InterfForCRef
{
	public Sample1 get(String s);
}

public class TestConstructorReference2 {

	public static void main(String[] args) {
		InterfForCRef interf=Sample1::new;
		Sample1 sample1=interf.get("pranaw");//it will go to String constrcor
		Sample1 sample2=interf.get("ravi");
		Sample1 sample3=interf.get("rahul");
		
		
	}
	
}
