package collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestAveragingDouble {

	public static void main(String[] args) {
		Stream<String> s=Stream.of("1","14","12","12","166");
		
		double d=s.collect(Collectors.averagingDouble(n->Double.parseDouble(n)));
		System.out.println(d);
	}
}
