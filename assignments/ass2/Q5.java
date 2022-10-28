package com.assignments.ass2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Enter height and base of the Parallelogram:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Area of the Parallelogram is:"+(a*b) );
    }
}
