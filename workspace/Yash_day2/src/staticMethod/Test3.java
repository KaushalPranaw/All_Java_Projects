package staticMethod;

interface I3
{
	public static void m1()
	{
		System.out.println("interface static method");
	}
}

public class Test3 implements I3 {

	public static void main(String[] args) {
		I.m1();
		// wrong ways are
		/*
			m1(); 
			Test.m1();
			Test t=new Test();
			t.m1();
			I i;
			i.m1();
		*/
		
	}
}
