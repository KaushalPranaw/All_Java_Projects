package stream;
 
import java.util.stream.*;
public class TestStream8_stream_of {

	public static void main(String[] args) {
		/* Stream s=Stream.of(9,99,999);
		 s.forEach(System.out::println);*/
		
		/* Stream<Integer> s=Stream.of(9,99,999);
		 s.forEach(System.out::println);*/
		 
		 Integer[] i= {10,20,30,40,23};
		 Stream.of(i).forEach(System.out::println);
	}
}
