package com.core;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		int a,b,c,result;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A & B : ");
		a=sc.nextInt();		
		b=sc.nextInt();		
		
		System.out.println("1 for Addition");
		System.out.println("2 for Subtraction");
		System.out.println("3 for Multiplication");
		System.out.println("4 for Division");
		c=sc.nextInt();
		
		switch(c) {
			case 1 :
				System.out.println("Addition is : "+(a+b));
				break;
		
			case 2 :
				System.out.println("Subtraction is : "+(a-b));
				break;
				
			case 3 :
				System.out.println("Multiplication is : "+a*b);
				break;
				
			case 4 :
				System.out.println("Division is : "+a/b);
				break;
				
			default :
				System.out.println("Invalid Input");
		}	
	}
}
