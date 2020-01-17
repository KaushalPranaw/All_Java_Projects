package additional_FI;

import java.util.function.IntPredicate;

public class Test_IntPredicare {

	
	public static void main(String[] args) {
		int[] numbers= {1,4,2,3,44};
		IntPredicate intPredicate = number -> number%2==0;
		for(int number:numbers)
		{
			if(intPredicate.test(number))
				System.out.println(number);
		}
	}
}
