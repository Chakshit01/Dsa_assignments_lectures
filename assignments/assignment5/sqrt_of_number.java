package com.assignments.assignment5;

public class sqrt_of_number {
    public static void main(String[] args) {
        System.out.println("Sqrt of a number");
        int x=8;
        System.out.println(mySqrt(x));
    }

    static int mySqrt(int x)
    {
        int ans =0;
        int s=0;
        int e=x;

        while (s<e)
        {
            int mid = (s+e)/2;
            if (mid*mid<e)
            {
                s=mid+1;
                ans=mid;
            } else if (mid * mid > e) {
                e=mid-1;
            }
            else
            {
                return mid;
            }

        }
        return ans;
    }
}
