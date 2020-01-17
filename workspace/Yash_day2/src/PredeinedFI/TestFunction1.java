package PredeinedFI; 
import java.util.function.*;
 
 
public class TestFunction1 {
	 
	public static void main(String[] args) {
		 
		 Function<Integer, Integer> f=i->i*i;
		 System.out.println(f.apply(5));
		
	}

}
