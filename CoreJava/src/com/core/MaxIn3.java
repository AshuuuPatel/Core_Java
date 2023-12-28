package com.core;

import java.util.Scanner;

public class MaxIn3 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three values : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b) {
            if (a > c) {
            } else {
                System.out.println("Max value is : " + c);
            }
        } else if (b > c) {
            System.out.println("Max value is : " + b);
        } else {
            System.out.println("Max value is : " + c);
        }
    }
}