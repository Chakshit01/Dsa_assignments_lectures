package com.company.lecture2;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Printing the fibonacci series");
        System.out.print("Enter the number you want to display of the fibonacci series:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count<=n)
        {
            int temp = b;
            b=a+b;
            a=temp;
            count++;
        }
        System.out.println("The "+n+"th number of fibonacci series is: " +b);
    }
}
