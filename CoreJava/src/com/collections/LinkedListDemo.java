package com.collections;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("B");
		list.addLast("E");
		list.add("D");
		list.add(1, "C");
		list.addFirst("A");
		list.addFirst("A");
		
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);

		list.removeFirst();
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);

		list.removeFirst();
		System.out.println(list);

		list.removeAll(list);
		System.out.println(list);
	}
}
