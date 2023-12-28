package oops.java;

import java.util.Scanner;

class Values {
	public void values(int a,int b) {
		
		System.out.println(a+b);
	}
}
class Addition extends Values {
	public void add(int a,int b) {
		System.out.println(a-b);
	}
}

public class MultipleInheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		Addition add = new Addition();
		add.values(n, m);
		add.add(n, m);
	}
}
