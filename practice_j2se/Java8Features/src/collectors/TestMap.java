package collectors;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMap {

	public static void main(String[] args) {
		Stream<String[]> s=Stream.of(new String[][] {{"abc","bcd"},
													{"cde","def"},
													{"efg","fgh"}});
		Map<String, String> map= s.collect(Collectors.toMap(p->p[0], p->p[1]));
		System.out.println(map);
		
		//two map key can be same so to solve this problem we use
		// toMap overloaded method i,e
		/*public static  Collector<T, ?, Map> 
	    toMap(Function keyMapper, 
	          Function valueMapper, 
	          BinaryOperator<U> mergeFunction)*/
		
		Stream<String[]> s1=Stream.of(new String[][] {{"abc","bcd"},
			{"cde","def"},
			{"abc","fgh"}});
		Map<String, String> map1= s1.collect(Collectors.toMap(p->p[0], p->p[1],(a,b)->a+","+b));
		System.out.println(map1);
		
		
		//to get LinkedHashMap type thing we can use another overloaded method i,e
		/*public static <T, K, U, M extends Map> Collector 
	    toMap(Function keyMapper,
	          Function valueMapper,
	          BinaryOperator<U> mergeFunction,
	          Supplier mapSupplier)*/
		
		Stream<String[]> s2=Stream.of(new String[][] {{"abc","bcd"},
			{"cde","def"},
			{"abc","fgh"}});
		LinkedHashMap<String, String> map2= s2.collect(Collectors.toMap(
									p->p[0], 
									p->p[1],
									(a,b)->a+","+b,
									LinkedHashMap::new));
		System.out.println(map2);
		
	}
}
