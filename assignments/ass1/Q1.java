package com.assignments.ass1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Checking whether the number is odd or even");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a%2==0){
            System.out.println(a + " is even");
        }
        else
        {
            System.out.println(a + " is odd");
        }
    }
}
