package com.assignments.ass2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("Area of the rhombus");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter diagonal 1:");
        int a=in.nextInt();

        System.out.println("Enter diagonal 2:");
        int b=in.nextInt();

        System.out.println("Area of the rhombus is: "+(a*b)/2);
    }
}
