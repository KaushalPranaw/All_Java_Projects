package stream4_builder;

import java.util.stream.Stream;

public class TestStreamBuilder {

	public static void main(String[] args) {
		Stream.Builder<String> streamBuilder=Stream.builder();
		
		streamBuilder.accept("pranaw");
		streamBuilder.accept("raj");
		streamBuilder.accept("keshari");
		
		Stream<String> stream=streamBuilder.build();
		stream.forEach(System.out::println);
		
		 try { 
	            streamBuilder.accept("50"); 
	        } 
	        catch (Exception e) { 
	            System.out.println("Exception thrown "
	                               + "when now adding element into the stream: "
	                               + e); 
	        } 
		
	}
}
