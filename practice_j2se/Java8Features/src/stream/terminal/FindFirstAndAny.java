package stream.terminal;

import java.util.stream.Stream;

public class FindFirstAndAny {

	public static void main(String[] args) {
		//sequential stream
        Stream.of("one", "two", "three", "four")
                .findAny()
                .ifPresent(System.out::println);
         
        //parallel stream
        Stream.of("one", "two", "three", "four")
            .parallel()
            .findAny()
            .ifPresent(System.out::println);
        
        //=============================
        
      //sequential stream
        Stream.of("one", "two", "three", "four")
                .findFirst()
                .ifPresent(System.out::println);
         
        //parallel stream
        Stream.of("one", "two", "three", "four")
            .parallel()
            .findFirst()
            .ifPresent(System.out::println);
	}
}
