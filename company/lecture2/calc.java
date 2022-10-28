package com.company.lecture2;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        System.out.println("Designing a calculator:)");
        Scanner in = new Scanner(System.in);

        while (true)
        {
            System.out.println("enter the operand: ");
            char op = in.next().trim().charAt(0);
            System.out.println("Enter two numerical values: ");
            int ans =0;
            if (op=='+'|| op=='-' || op=='*' || op=='/' || op=='%' || op=='x')

            {
                int a= in.nextInt();
                int b= in.nextInt();
                if (op=='+')
                {
                    ans=a+b;
                }
                if (op=='-')
                {
                    ans=a-b;
                }
                if (op=='*')
                {
                    ans=a*b;
                }
                if (op=='/')
                {
                    ans=a/b;
                }
                if(op=='%'){
                    ans=a%b;
                }
                if (op=='x')
                {
                    System.out.println("ending up the calculator:) ");
                    break;
                }

                }
            else
            {
                System.out.println("Error");
            }
            System.out.println("The answer is: " +ans);
            }

        }
}
