package stream.terminal;

import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,3,2,4,5,6,6);
		Integer[]a=list.stream().toArray(Integer[]::new);
		System.out.println(Arrays.toString(a));
	}
}
