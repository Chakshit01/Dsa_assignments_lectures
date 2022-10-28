package com.assignments.ass2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Area of the circle");
        System.out.println("Enter the radius of the circle:");
        Scanner in= new Scanner(System.in);
        float r = in.nextFloat();
        double area=(22*r*r)/7;
        System.out.println("Area of the circle is: "+area);



    }
}
