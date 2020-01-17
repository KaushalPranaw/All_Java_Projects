package PredeinedFI; 
import java.util.function.*;
 
 
public class TestPredicate5 {
	 
	public static void main(String[] args) {
		 
		int[] x= {0,4,8,3,3,2,2,2,3};
		Predicate<Integer> p1=i->i%2==0;
		Predicate<Integer> p2=i->i>2;
		
		//and(),or(),negate()
		
		/*System.out.println("even and >2 are: ");
		for(int i:x)
		{
			if(p1.and(p2).test(i))
				System.out.println(i);
			
			 
			
		}*/
		
		/*System.out.println("even or >2 are: ");
		for(int i:x)
		{
			if(p1.or(p2).test(i))
				System.out.println(i);
			
		}*/
		
		System.out.println("not even");
		for(int i:x)
		{
			if(p1.negate().test(i))
				System.out.println(i);
			
		}
		
	}

}
