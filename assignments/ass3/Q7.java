package com.assignments.ass3;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        System.out.println("Check whether the number is prime or not");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println("Is the number prime: " +ans);
    }

    static boolean isPrime(int n) {
        if (n < 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;

            }
            c++;

        }
        return (c * c > n);
    }
}
