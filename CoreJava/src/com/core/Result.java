package com.core;

import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        int percent, eng, chem, phy;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of English, Chemistry & Physics : ");
        eng = sc.nextInt();
        chem = sc.nextInt();
        phy = sc.nextInt();
        percent = (eng + chem + phy) * 100 / 300;
        System.out.println("percentage : " + percent);
        if (percent > 79) {
            System.out.println("Distinction");
        } else if (percent > 59) {
            System.out.println("First class");
        } else if (percent > 44) {
            System.out.println("Average");
        } else {
            System.out.println("FAIL");
        }
    }

}