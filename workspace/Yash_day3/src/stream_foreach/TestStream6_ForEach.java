package stream_foreach;

import java.util.ArrayList;
import java.util.stream.Stream; 

public class TestStream6_ForEach {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(0);
		list.add(10);
		list.add(501);
		list.add(4);
		list.add(1);
		list.add(150);
		System.out.println(list);
	list.stream().forEach(v->System.out.println(v));
		
	
	/*Consumer<Integer> c=i->{
			System.out.println(i);
		};
		list.stream().forEach(c);*/
		//list.stream().forEachOrdered(System.out::println);
		System.out.println("for each ordered---------");
		/*list.stream().forEachOrdered(System.out::println);*/
		
		
		
		
		//Note
		//foreach
		System.out.println("--------ForEach---------");
		Stream.of("AAA","BBB","CCC").parallel().forEach(s->System.out.println("Output:"+s));
		//foreach ordered
		System.out.println("--------ForEach Ordered---------");
		Stream.of("AAA","BBB","CCC").parallel().forEachOrdered(s->System.out.println("Output:"+s));
	}
}
