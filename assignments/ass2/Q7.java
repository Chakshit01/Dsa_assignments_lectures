package com.assignments.ass2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        System.out.println("Area of equilateral triangle");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of the triangle:");
        int a = in.nextInt();
        double ans = (Math.sqrt(3))*a*a/4;
        System.out.println("Area of the equilateral triangle is: "+ans);
    }
}
