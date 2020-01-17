package stream3_generate;

import java.util.Random;
import java.util.stream.Stream;

public class GenerateExample {

	public static void main(String[] args) {
		/*Stream.generate(new Random()::nextInt).limit(5).forEach(System.out::println);
	*/
	//	Stream.generate(new Random()::nextInt).forEach(System.out::println);//UNLIMITED VALUE
		
		Stream.generate(()->"abc").limit(5).forEach(System.out::println);
	}
}
