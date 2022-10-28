package com.assignments.ass1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Finding the greatest number:");
        Scanner in  =new Scanner(System.in);
        System.out.println("Enter num1:");
        int a = in.nextInt();
        System.out.println("Enter num2:");
        int b = in.nextInt();
        if (a>b)
        {
            System.out.println("a is greater than b");
        }
        else
            System.out.println("b is greater than a");
    }
}
