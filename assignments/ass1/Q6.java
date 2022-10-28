package com.assignments.ass1;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("converting rupees in usd");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter currency in rupees:");
        float Rs = in.nextFloat();
        double usd = (Rs/75.65);
        System.out.println("currency in usd:"+usd);


    }
}
