package com.map;

import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("a", 10);
		map.put("b", 20);
		map.put("c", 30);
		map.put("d", 40);
		
		System.out.println("Size of map is " + map.size());
		System.out.println(map);
		System.out.println(map.get("b"));
		
		if (map.containsKey("a")) {
			Integer a = map.get("a");
			System.out.println("Value of a is " +a);
		}
		
		for (String key : map.keySet()) {
			System.out.println("key : " +key+ " , values : "+map.get(key));
		}
	}
}


