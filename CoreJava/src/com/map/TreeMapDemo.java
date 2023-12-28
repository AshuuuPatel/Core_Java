package com.map;

import java.util.*;

public class TreeMapDemo {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> treemap = new TreeMap<>();
		
		treemap.put(3, "A");
		treemap.put(2, "B");
		treemap.put(1, "C");
		
		System.out.println(treemap);
		
		System.out.println(treemap.get(1));
	
		TreeMap<String, Integer> treemap1 = new TreeMap<>();
		
		treemap1.put("B", 2);
		treemap1.put("A", 3);
		treemap1.put("C", 1);
		
		System.out.println(treemap1);
	}
}
