package stream;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		Optional<Integer> optional=Optional.of(5);
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		
		Optional<Integer> optional1=Optional.empty();
		System.out.println(optional1.isPresent());
	//	System.out.println(optional1.get()); // run time error ayegi  java.util.NoSuchElementException
		//to handle use like this
		
		if(optional1.isPresent()){
		    System.out.println(optional1.get());
		}
		
		Optional<Integer> possible1 = Optional.ofNullable(null); 
		//or
		Optional<Integer> possible2 = Optional.ofNullable(5);
		//System.out.println(possible1.get());
		System.out.println(possible2.get());
	}
}
