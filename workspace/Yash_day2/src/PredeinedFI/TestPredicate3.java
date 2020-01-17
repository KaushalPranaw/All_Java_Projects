package PredeinedFI;
import java.util.function.*;
 

public class TestPredicate3 {
	 
	public static void main(String[] args) {
		 
		/*Predicate<Employee> predicate=e->e.sal>1000 &&e.isHavingGf==true;
		 * System.out.println(predicate.test(e));
		*/ 
		// any type of condition checking can be done by predicate
		
		
		String[] s= {"Aaaaaaaaaa","Baa","Caaaaaaaaaaaaa","Z","D","R","G"};
		//string whose length is greater than 5
		Predicate<String> p=a->a.length()>5;
		for(String i:s)
		{
			if(p.test(i))
				System.out.println(i);
		}
		
		
	}

}
