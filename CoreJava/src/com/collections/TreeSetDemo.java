package com.collections;

import java.util.*;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> treeset = new TreeSet<>();
		
		treeset.add("B");
		
		boolean r1 = treeset.add("C");
		System.out.println(r1);
		
		boolean r2 = treeset.add("C");
		System.out.println(r2);
		treeset.add("b");
		treeset.add("a");
		treeset.add("A");
		
		System.out.println(treeset);

		TreeSet<Integer> sort = new TreeSet<>();
		
		sort.add(5);
		sort.add(3);
		sort.add(9);
		sort.add(6);
		sort.add(8);
		
		System.out.println(sort);
		
		for (int i : sort) {
			System.out.print(i+ " ");
		}
	}
}
