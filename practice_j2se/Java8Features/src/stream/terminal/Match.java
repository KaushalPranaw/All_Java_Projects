package stream.terminal;

import java.util.stream.Stream;

public class Match {

	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("one", "two", "three", "four");
		Stream<String> stream2 = Stream.of("one", "two", "three", "four");
		Stream<String> stream3 = Stream.of("one", "two", "three", "four");
        
        boolean anyMatch = stream1.anyMatch(s -> s.contains("five"));
        boolean allMatch = stream2.allMatch(s -> s.contains("five"));
        boolean noneMatch = stream3.noneMatch(s -> s.contains("five"));
        
        System.out.println(anyMatch);      //true
        System.out.println(allMatch);
        System.out.println(noneMatch);
	}
}
