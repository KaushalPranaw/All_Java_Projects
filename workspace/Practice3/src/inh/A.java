package inh;

public class A {

	A()
	{
		super();
		System.out.println("A is called");
	}
	public static void main(String[] args) {
		C c=new C();
	}
	
}

class B extends A
{
	B()
	{super();
		System.out.println("B is called");
	}
}

class C extends B
{
	public C() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("C is called");
	}
}
