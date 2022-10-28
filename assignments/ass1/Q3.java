package com.assignments.ass1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Find out the simple interest:");
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        float r = in.nextFloat();
        float t = in.nextFloat();
        float si = (p*r*t)/100;
        System.out.println("simple interest is " +si);
    }
}
