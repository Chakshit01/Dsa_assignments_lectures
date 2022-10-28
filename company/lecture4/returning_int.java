package com.company.lecture4;

import java.util.Scanner;

public class returning_int {
    public static void main(String[] args) {
         int ans = sum();
        System.out.println(ans);
    }
    static int sum()
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
         int b= in.nextInt();
         int c = a+b;
         return c;
    }
}
