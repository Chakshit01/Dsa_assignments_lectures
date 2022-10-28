package com.assignments.ass2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Area of triangle");
        System.out.println("Enter base and height of the triangle:");
        Scanner in = new Scanner(System.in);
        float b=in.nextFloat();
        float a=in.nextFloat();
        System.out.println("Area of the triangle is: "+(0.5*a*b));
    }
}
