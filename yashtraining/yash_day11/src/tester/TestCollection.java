package tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestCollection {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(1, 3, 4, 21, 55, 2));
		Iterator<Integer> i = list.iterator();
		//i.remove();
//		/i.remove();
		//list.remove(0);
		System.out.println(list.size());
		while (i.hasNext())
		{
			//list.add(5);
			//i.remove();
			int a=i.next();
			//if(a==2)
				i.remove();
			//System.out.println(a);
		}
		System.out.println(list.size());
		for(int a:list)
		{
			System.out.println(a);
		}
	}
}
