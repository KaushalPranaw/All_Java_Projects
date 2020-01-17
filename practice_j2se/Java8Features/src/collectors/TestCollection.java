package collectors;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCollection {

	public static void main(String[] args) {
		 // Creating a string stream 
        Stream<String> s = Stream.of("Geeks", "for", "GeeksClasses"); 
  
        // Using toCollection() method 
        // to create a collection 
        Collection<String> names = s 
                                       .collect(Collectors 
                                                    .toCollection(HashSet::new)); 
  
        // Printing the elements 
        System.out.println(names); 
        
     // Creating a string stream 
        Stream<String> s1 = Stream.of("2.5", "6", "4"); 
  
        // Using Collectors toCollection() 
        Collection<String> names1 = s1 
                                       .collect(Collectors 
                                                    .toCollection(TreeSet::new)); 
  
        // Printing the elements 
        System.out.println(names1); 
	}
}
