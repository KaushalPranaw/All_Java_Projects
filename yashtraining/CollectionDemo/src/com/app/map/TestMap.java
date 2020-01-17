package com.app.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "pranaw");
		map.put(2, "rejo");
		map.put(3, "rahul");
		map.put(4, "pavan");
		System.out.println(map);
		for(Map.Entry<Integer, String> m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
