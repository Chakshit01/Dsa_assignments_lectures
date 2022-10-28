package com.assignments.ass3;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner in =new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        isPrime(a,b);
    }
    static void isPrime(int a, int b) {

        for(int n=a;n<=b;n++) {
            if (n < 1) {
//             false;
                continue;
            }
            int c = 2;
            while (c * c <= n) {
                if (n % c == 0) {
//                 false;
                    continue;

                }
                c++;

            }
            if (c * c > n) {
                System.out.println(n);
            }

        }
    }

}
