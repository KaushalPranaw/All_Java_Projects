package collectors;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestGroupingBy {

	public static void main(String[] args) {
	
        List<String> g 
            = Arrays.asList("geeks", "for", "geeks"); 

        
        // Collect the list as map 
        // by groupingBy() method 
        Map<String, Long> result 
            = g.stream().collect( 
                Collectors.groupingBy( 
                    Function.identity(), 
                    Collectors.counting())); 
  
        // Print the result 
        System.out.println(result); 
		
	}
}
