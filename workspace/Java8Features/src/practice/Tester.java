package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Tester {
	public static void main(String[] args) {
		Set<String> gamesList = new HashSet<String>();
		/*amesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hocky");
		System.out.println("------------Iterating by passing lambda expression---------------");
		gamesList.stream().forEach(games -> System.out.println(games));
		System.out.println("------------Iterating by passing method reference---------------");
		gamesList.stream().forEachOrdered(System.out::println);*/
		
		Stream.of("AAA","BBB","CCC").parallel().forEach(s->System.out.println("Output:"+s));
		Stream.of("AAA","BBB","CCC").parallel().forEachOrdered(s->System.out.println("Output:"+s));
	}

}