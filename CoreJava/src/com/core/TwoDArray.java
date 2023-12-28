package com.core;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row,col;
		System.out.print("Enter Row & Col : ");
		row = sc.nextInt();
		col = sc.nextInt();
		int a[][]=new int[row][col];
		int i, j;
		
		System.out.println("Enter 2D Array");
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				System.out.print("Enter "+i+" Row & "+j+" Colimn :");
				a[i][j]=sc.nextInt();			}
		}
		System.out.println("\n2D Array is");
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}
