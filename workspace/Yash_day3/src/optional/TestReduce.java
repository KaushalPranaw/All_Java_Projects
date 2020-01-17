package optional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*; 

public class TestReduce {

	public static void main(String[] args) {
		// creating a list of Strings 
        List<String> words = Arrays.asList("GFG", "Geeks", "for", 
                                           "GeeksQuiz", "GeeksforGeeks");
        
      //  words.stream().parallel()forEachOrdered(System.out::println);
	
       words.stream().reduce((a,b)->a.length()>b.length()?a:b).ifPresent(System.out::println);;
        
     /*  int product = IntStream.range(2, 8) 
               .reduce((num1, num2) -> num1 * num2) 
               .orElse(-1); 

	  // Displaying the product 
	  System.out.println("The product is : " + product); */
       
       List<Integer> array = Arrays.asList(-2, 0, -2, 6, 8); 
       long distinct=array.stream().distinct().count();
       System.out.println(distinct);
       // Finding sum of all elements 
       int sum = array.stream().reduce(0, 
               (element1, element2) -> element1 + element2); 
 
       // Displaying sum of all elements 
       System.out.println("The sum of all elements is " + sum); 
      IntStream.range(2, 4).reduce((a,c)->a*c).ifPresent(System.out::println);
      Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
      System.out.println(streamIterated.collect(Collectors.toList()));
      
	}
}
