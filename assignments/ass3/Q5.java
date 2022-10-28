package com.assignments.ass3;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Product of two numbers");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sol=prod(a,b);
        System.out.println(sol);
    }
    static int prod(int a,int b){
        int ans = a*b;
        return ans;
    }
}
