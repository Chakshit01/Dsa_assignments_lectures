package com.assignments.ass2;

import java.util.Scanner;
import java.lang.Math.*;
public class Q14 {
    public static void main(String[] args) {
        System.out.println("Volume of the cone");
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the radius of the cone:");
        float r = in.nextFloat();

        System.out.println("Enter the height of the cone:");
        float h = in.nextFloat();

        double vol =Math.PI*h*r*r/3;
        System.out.println("Volume of the cone is: "+vol);
    }
}
