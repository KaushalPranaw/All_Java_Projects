package PredeinedFI;

//Predicate<T>
interface I
{
	public boolean test(Integer i);
	 
}

public class TestPredicate {
	/*public boolean test(Integer i)
	{
		if(i%2==0)
			return true;
		else
			return false;
	}*/
	public static void main(String[] args) {
		//I i=(a)->a%2==0;
		
		I i=a->a%2==0;
		System.out.println(i.test(10));
		
		
	}

}
