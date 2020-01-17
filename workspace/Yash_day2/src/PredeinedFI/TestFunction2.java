package PredeinedFI; 
import java.util.function.*;
 
 
public class TestFunction2 {
	 
	public static void main(String[] args) {
		 
		 Function<String, Integer> f=s->s.length();
		 System.out.println(f.apply("pranaw"));
		 
		 Function<String, String> f1=s->s.toUpperCase();
		 System.out.println(f1.apply("pranaw"));
		 
		 
		
	}

}
