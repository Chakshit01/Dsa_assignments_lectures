package com.assignments.ass2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Area of rectangle");
        System.out.println("Enter length and breadth of the rectangle:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Area of the rectangle is:"+(a*b) );
    }
}
