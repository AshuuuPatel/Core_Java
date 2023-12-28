package com.core;

import java.util.*;

public class MathsClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Maths
		
	  /* Find the max Value "5, 6"
		 int s = (Math.max(5,  6));
		 int result = (Math.max(8, s));
		 System.out.println("max value out of 5,6,8 is "+result);
		 System.out.println(Math.max(5, 6));
		 System.out.println(Math.min(5, 6));
	  */
		// Random Function
		int mynum = (int)(Math.random()*100);
		int usernum = 0;
		
		do {
			System.out.print("Guess my number : ");
			usernum = sc.nextInt();
			
			if(usernum == mynum) {
				System.out.println("WOOHOO . . Correct Number..!");
				break;
			}
			
			else if(usernum > mynum) System.out.println("Its too large");
			
			else System.out.println("Its too small");
			
		} while(usernum >= 0);
		
	}
}
