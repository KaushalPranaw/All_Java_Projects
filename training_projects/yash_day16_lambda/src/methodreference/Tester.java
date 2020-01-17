package methodreference;

public class Tester {
	public static void main(String[] args) {
		
		FI predicate=EvenOddCheck::isEven;
		System.out.println(predicate.test(25));
		System.out.println(predicate.test(42));
		//throw null;
		try
		{
			System.out.println("b");
			RuntimeException re=null;
			throw re;
		}
		finally {
			System.out.println("a");
		}
		
		
	}
}