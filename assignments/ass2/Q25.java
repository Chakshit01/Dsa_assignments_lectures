package com.assignments.ass2;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        int sum=0;
        int product=1;
        while (a>0)
        {
            int rem=a%10;
            sum=sum+rem;
            product=product*rem;
            a=a/10;
        }


        System.out.println("Sum of digits= "+sum);
        System.out.println("Product of digits= "+product);

        int Result = product-sum;
        System.out.println("Result= "+Result);
    }
}
