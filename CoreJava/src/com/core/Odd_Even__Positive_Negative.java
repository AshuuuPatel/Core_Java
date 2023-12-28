package com.core;

import java.util.Scanner;

public class Odd_Even__Positive_Negative {

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value A: ");
        a = sc.nextInt();
        if (a > 0) {
            System.out.print("Number IS POSITIVE & ");
        } else {
            System.out.print("Number is negative & ");
        }
        if (a % 2 == 0) {
            System.out.println("It is EVEN...!");
        } else {
            System.out.println("It is ODD...!");
        }

    }

}