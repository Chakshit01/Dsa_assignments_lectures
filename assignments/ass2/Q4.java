package com.assignments.ass2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Area of isosceles triangle");
        System.out.println("Enter height and base of the Triangle:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Area of the rectangle is:"+(a*b)/2 );
    }
}
