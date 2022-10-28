package com.assignments.ass3;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        System.out.println("Factorial of a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fact=Factorial(n);
        System.out.println("Factorial of "+n+" is "+fact);


    }
    static int Factorial(int n){
        int ans=1;
        for(int i=1;i<=n;i++)
        {

            ans=ans*i;

        }
        return ans;
    }
}
