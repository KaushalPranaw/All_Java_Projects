package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestCount {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("a","b","c","d","gfds");
		Long c=list.stream().collect(Collectors.counting());
		System.out.println(c);
	}
}
