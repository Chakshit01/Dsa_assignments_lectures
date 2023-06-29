package com.company.lecture17;

public class patternUsingRecursion {
    public static void main(String[] args) {
        System.out.println("Pattern using recursion");

        Pattern(0,4);
    }

    static void Pattern(int c,int r)
    {
        if(r==0)
        {
            return;
        }

        if (c<r)
        {
            System.out.print("*");
            Pattern(c+1,r);
        }

        else
        {
            System.out.println();
            Pattern(0,r-1);
        }
    }
}
