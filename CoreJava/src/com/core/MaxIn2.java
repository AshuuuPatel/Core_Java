package com.core;

import java.util.Scanner;

public class MaxIn2 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two values : ");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {
            System.out.println("Max value is : " + a);
        } else {
            System.out.println("Max value is : " + b);
        }
    }
}
