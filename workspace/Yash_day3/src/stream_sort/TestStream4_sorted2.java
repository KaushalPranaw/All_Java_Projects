package stream_sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; 

public class TestStream4_sorted2 {

	public static void main(String[] args) {
		 ArrayList<String> heroins=new ArrayList<>();
		 heroins.add("preeti");
		 heroins.add("katrina");
		 heroins.add("karina");
		 heroins.add("mallika");
		 heroins.add("shilpa");
		 System.out.println(heroins);
		 //sorted
		 List<String> sortedHeroins=heroins.stream().sorted().collect(Collectors.toList());
		 System.out.println(sortedHeroins);
		 
		 //reverse sorted
		 List<String> descendSortedHeroins=heroins.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		 System.out.println(descendSortedHeroins);
	}
}
