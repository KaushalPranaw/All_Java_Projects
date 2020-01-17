package stream;

import java.util.ArrayList;
import java.util.stream.*;
public class TestStream7_ToArray {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(0);
		list.add(10);
		list.add(501);
		list.add(110);
		list.add(21);
		list.add(150);
	//	System.out.println(list);
	
		 
		Integer[] numbers=list.stream().toArray(Integer[]::new);
	//	System.out.println(numbers.length);
		/*for(int i:numbers)
		{
			System.out.println(i);
		}*/
		
		Stream.of(numbers).forEach(System.out::println);

	}
}
