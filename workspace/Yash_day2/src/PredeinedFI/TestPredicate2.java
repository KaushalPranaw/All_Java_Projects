package PredeinedFI;
import java.util.function.*;
 

public class TestPredicate2 {
	 
	public static void main(String[] args) {
		 
		Predicate<Integer> predicate=a->a%2==0;
		System.out.println(predicate.test(10));
		System.out.println(predicate.test(15));
		
	}

}
