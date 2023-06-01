package com.company.lecture15;

public class reversingAnumber {
    public static void main(String[] args) {
        System.out.println("Reversing a number using recurrence relation");
        int n=84211248;
//        int ans = rev(n);
//        System.out.println(ans);
        boolean x =palin(n);
        System.out.println(x);
    }

    static int sum =0;
    static int rev(int n)
    {
        if (n==0)
        {
            return 0;
        }
        int rem = n%10;
        sum = sum*10 + rem;
         rev(n/10);
         return sum;

    }

    static boolean palin(int n)
    {
        return n== rev(n);// checking palindrome or not
    }
}
