package com.assignments.ass3;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        System.out.println("Palindrome number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean sol=check(num);
        System.out.println("Is the number Palindrome: "+sol);
    }
    static Boolean check(int num) {
        int i = num;
        int ans = 0;
        while (i < 0) {
            int r = i % 10;
            ans = (ans * 10) + r;
            i=i/10;
        }
        return (ans==num);
    }
}
