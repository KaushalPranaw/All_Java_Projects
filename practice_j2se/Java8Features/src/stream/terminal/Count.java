package stream.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Count {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,1,2,4,5,666,6);
		System.out.println(list.stream().count());
		
		long count = Stream.of("how","to","do","in","java").collect(Collectors.counting());
	    System.out.printf("There are %d elements in the stream %n", count);
	}
}
