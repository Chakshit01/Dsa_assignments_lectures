package com.assignments.ass9;

public class q2 {
    public static void main(String[] args) {
       pattern(4);
    }

    static void pattern(int n)
    {
        for (int row=1; row<=n; row++)
        {
            for (int col=1;col<=row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
