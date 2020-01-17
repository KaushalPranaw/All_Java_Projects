package PredeinedFI; 
import java.util.function.*;
 
 
public class TestConsumer1 {
	 
	public static void main(String[] args) {
		 
		 Consumer<String> c=s->System.out.println(s);
		 c.accept("durga");
		 c.accept("pranaw");
		 
	}

}
