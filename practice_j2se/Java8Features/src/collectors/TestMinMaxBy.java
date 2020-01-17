package collectors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMinMaxBy {

	public static void main(String[] args) {
		
		// creating a Stream of strings 
        Stream<String> s = Stream.of("2", "3", "4", "5"); 
  
        // using Collectors minBy(Comparator comparator) 
        // and finding the minimum element 
        // in reverse order 
        Optional<String> obj = s 
                                   .collect(Collectors 
                                                .minBy(Comparator 
                                                           .naturalOrder())); 
  
        // if present, print the element 
        // else print the message 
        if (obj.isPresent()) { 
            System.out.println("Min = "+obj.get()); 
        } 
        else { 
            System.out.println("no value"); 
        } 
		
		// creating a Stream of strings 
        Stream<String> s1 = Stream.of("2", "3", "4", "5"); 
  
        // using Collectors maxBy(Comparator comparator) 
        // and finding the maximum element 
        // in reverse order 
        Optional<String> obj1 = s1 
                                   .collect(Collectors 
                                                .maxBy(Comparator 
                                                           .naturalOrder())); 
  
        // if present, print the element 
        // else print the message 
        if (obj1.isPresent()) { 
            System.out.println("Max = "+obj1.get()); 
        } 
        else { 
            System.out.println("no value"); 
        } 
        
        
		
	}
}
