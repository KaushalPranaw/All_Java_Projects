package practice;

interface A
{
	void draw();

	@Override
	boolean equals(Object obj);

	@Override
	int hashCode();

	@Override
	String toString();
	
	default void a()
	{
		System.out.println("a()");
	}
	static void b()
	{
		System.out.println("b()");
	}
	
}
public class Tester3 {

	public static void main(String[] args) {
		 A a=()->{System.out.println("draw");};
		 a.draw();
		 a.a();
		 A.b();
		 a.hashCode();
	}
}
