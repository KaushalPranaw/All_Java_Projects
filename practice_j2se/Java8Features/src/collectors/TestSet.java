package collectors;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestSet {

	public static void main(String[] args) {
		Stream<String> s=Stream.of("1","14","12","12","166");
		Set<String> set=s.collect(Collectors.toSet());
		System.out.println(set);
	}
}
