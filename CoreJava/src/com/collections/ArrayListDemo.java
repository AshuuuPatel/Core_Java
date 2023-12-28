package com.collections;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(5);
		
		for (int i = 1; i <= 5; i++) {
			arr.add(i);
		}
		
		// Printing elements
		System.out.println(arr);
		
		// Removing element at index 3
		arr.remove(3);
		
		System.out.println(arr);
		
		// Adding element
		arr.add(6);
		arr.add(7);
		arr.add(8);
		arr.add(9);
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i)+ " ");
		}
		System.out.println();
		
		for (int i : arr) {
			System.out.print(i+ " ");
		}
	}
}
