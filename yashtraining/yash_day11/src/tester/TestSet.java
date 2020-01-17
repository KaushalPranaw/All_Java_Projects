package tester;

import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		Set<String> set=new LinkedHashSet<>();
		 
		/*set.add(3);
		set.add(1);
		set.add(2);*/
		set.add(null);
		set.add("a");
		System.out.println(set);
		/*Set<Integer> set1=new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);*/
		//System.out.println(set.equals(set1));
		//System.out.println(set.size());
	/*	HashMap<Integer, String> map=new HashMap<>();
		map.put(null, null);
		HashMap<Integer, String> map1=new HashMap<>();
		map1.put(null, null);
		System.out.println(map.equals(map1));
		*/
		IdentityHashMap<String, String> map=new IdentityHashMap<>();
		map.put(null, "a");
		map.put(new Integer(1).toString(), "b");
		map.put(new Integer(1).toString(), null);
		System.out.println(map);
		/*IdentityHashMap<Integer, String> map1=new IdentityHashMap<>();
		map1.put(1, "b");
		System.out.println(map.equals(map1));
		/*System.out.println(map);
		System.out.println(map.get(null));
		
		Hashtable<Integer, String> t=new Hashtable<>();
		t.put(1, null);
		System.out.println(t.values());*/
		//System.out.println(t);
		
	}
}
