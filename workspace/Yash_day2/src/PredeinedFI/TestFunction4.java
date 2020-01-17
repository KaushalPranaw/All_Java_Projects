package PredeinedFI; 
import java.util.function.*;
 
 
public class TestFunction4 {
	 
	public static void main(String[] args) {
		 
		 Function<Integer, Integer> f1=i->2*i;
		 Function<Integer, Integer> f2=i->i*i;
		 System.out.println(f1.andThen(f2).apply(4));//double then square
		 
		 System.out.println(f1.compose(f2).apply(4));// square then double
		
	}

}
