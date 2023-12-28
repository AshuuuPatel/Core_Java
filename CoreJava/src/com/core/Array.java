package com.core;

import java.util.Scanner;
import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int a[] = new int[5];
		int i, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(i = 0; i<a.length;i++) {
			System.out.print("Enter "+i+" Element : ");
			a[i]=sc.nextInt();	
			sum = sum +a[i];
		}
		for(i=0; i<a.length;i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
		System.out.println("Sum of Array is "+sum);
		
		// for length
		System.out.println("Length of Array is "+a.length);
		
		// before Sorting
		System.out.println("Before Sorting");
		for(i=0; i<a.length;i++) {
			System.out.print(a[i]+" \t");
		}
		System.out.println();
		// Sorting an Array
		Arrays.sort(a);
		
		// After Sorting
		System.out.println("After Sorting");
		for(i=0; i<a.length;i++) {
			System.out.print(a[i]+" \t");
		}
	}
}
