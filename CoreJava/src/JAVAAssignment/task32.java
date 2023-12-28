// new question

package JAVAAssignment;

import java.util.Scanner;

abstract class shape {
    abstract double rectangleArea(double length, double breadth);
    abstract double squareArea(double side);
    abstract double circleArea(double radius);
}

class Area extends shape {
    double rectangleArea(double length, double breadth) {
        return length * breadth;
    }

    double squareArea(double side) {
        return side * side;
    }

    double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class task32 {
    public static void main(String[] args) {
        Area areaCalculator = new Area();

        System.out.println("Area of Rectangle: " + areaCalculator.rectangleArea(5, 8));
        System.out.println("Area of Square: " + areaCalculator.squareArea(4));
        System.out.println("Area of Circle: " + areaCalculator.circleArea(3));


//  I3. Write a program which will ask the user to enter his/her marks (out of 100). 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks (out of 100): ");
        int marks = scanner.nextInt();

        // Display grade based on marks
        if (marks >= 91 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("Grade: B");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("Grade: C");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("Grade: D");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("Grade: DD");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("Grade: DD");
        } else if (marks <= 40) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks entered");
        }
    }
}
