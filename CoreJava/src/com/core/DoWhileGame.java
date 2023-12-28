package com.core;

import java.util.*;

public class DoWhileGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		do {
			System.out.println("input a Single Digit code");
			num = sc.nextInt();
		} while (num != 0);
		System.out.println("Your Code is Verified..!");
	}
}
