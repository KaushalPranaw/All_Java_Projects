package lambda7_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; 

public class TesterStream {

	public static void main(String[] args) {
		 ArrayList<Integer> l=new ArrayList<>();
		 l.add(20);
		 l.add(10);
		 l.add(30);
		 l.add(1);
		 l.add(50);
		 l.add(60);
		 System.out.println(l);
		 
		 List<Integer> l1=l.stream().filter(i->i%2==0).collect(Collectors.toList());
	//	 l.stream().forEach(System.out::println);
		 System.out.println(l1);
	}
}
