package com.assignments.ass1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Designing a calculator");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        char operand = in.next().charAt(0);
        if (operand=='+'){
            int ans = a+b;
            System.out.println("Ans = " + ans);
        }
        else if (operand == '-'){
            System.out.println("Ans = "+ (a-b));
        }
        else if (operand == '*'){
            System.out.println("Ans = "+(a*b));
        }
            else {
            System.out.println("Ans = " + (a/b));
    }

}
}
