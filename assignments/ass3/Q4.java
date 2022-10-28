package com.assignments.ass3;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Print the sum of two numbers");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sol=sum(a,b);
        System.out.println(sol);

    }
    static int sum(int a,int b){
        int ans = a+b;
        return ans;
    }
}
