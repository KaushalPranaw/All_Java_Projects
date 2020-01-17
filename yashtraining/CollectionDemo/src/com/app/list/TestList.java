package com.app.list;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("pranaw");
		list.add("rahul");
		System.out.println();
		Iterator<String> iterator=list.iterator();
		
		iterator.forEachRemaining(System.out::println);
		
		
		/*while(iterator.hasNext())
			System.out.println(iterator.next());*/
		
		/*list.forEach(System.out::println);*/
		
		/*list.forEach((v)->System.out.println(v));*/
		
	}
}
