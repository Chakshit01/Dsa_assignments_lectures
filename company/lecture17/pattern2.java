package com.company.lecture17;

public class pattern2 {
    public static void main(String[] args)
    {
        System.out.println("Pattern2");
        Pattern2(4,0);
    }

    static void Pattern2(int r, int c)
    {
        if (r==0)
        {
            return;
        }

        if (c<r)
        {

            Pattern2(r,c+1);
            System.out.print("*");
        }

        else
        {

            Pattern2(r-1,0);
            System.out.println();
        }
    }
}
