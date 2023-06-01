package com.company.lecture15;

public class SumofnNumbers {
    public static void main(String[] args) {
        System.out.println("Finding sum of n numbers");
        int ans = sum(5);
        System.out.println(ans);
    }

    static int sum(int n)
    {
        if (n==0)
        {
            return 0; // return condition is required for the topmost value of the stack
//                         from where we will pop out the elements
        }
        return n+sum(n-1);
    }
}
