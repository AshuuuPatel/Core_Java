package com.collections;

import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> hashset = new HashSet<>();
		
		hashset.add("A");
		hashset.add("B");
		
		boolean r1 = hashset.add("C");
		// System.out.println(r1);
		
		boolean r2 = hashset.add("C");
		// System.out.println(r2);
		
		System.out.println(hashset);
		
		System.out.println(hashset.contains("C"));
		System.out.println(hashset.contains("D"));
		
		System.out.println(hashset);
		
		hashset.remove("C");
		System.out.println(hashset.contains("C"));
		
		for (String item : hashset) {
			System.out.println(item);
		}
	}
}
