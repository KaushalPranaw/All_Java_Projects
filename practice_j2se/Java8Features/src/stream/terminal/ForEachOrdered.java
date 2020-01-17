package stream.terminal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ForEachOrdered {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,3,2,4,5,6,6);
		list.parallelStream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		list.parallelStream().sorted(Comparator.reverseOrder()).forEachOrdered(System.out::println);
		
	}
}
