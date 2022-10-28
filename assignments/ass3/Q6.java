package com.assignments.ass3;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("circumfrence of a circle");
        Scanner in = new Scanner(System.in);
        float  r = in.nextFloat();
        double ans = circm(r);
        System.out.println(ans);
    }
    static double circm(float r)
    {
        double cm = 2*3.14*r;
        return cm;

    }
}
