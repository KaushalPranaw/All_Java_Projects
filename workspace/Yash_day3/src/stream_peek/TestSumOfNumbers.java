package stream_peek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestSumOfNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(10);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		numbers.add(180);
		int sum=numbers.stream().filter(number->number>50).mapToInt(i->i).sum();
		//System.out.println(sum);
		numbers.stream().peek(System.out::println).collect(Collectors.toList());
		
	/*	
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        
		List<Integer> newList = list.stream()
		                            .peek(System.out::println)
		                            .collect(Collectors.toList());*/
	}
}
