package com.company.lecture14;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Checking weather prime or not");
        System.out.println("0 is neither prime nor composite");
        for (int i=1;i<=20;i++)
        {
            System.out.println(i+" "+isPrime(i));
        }
    }

    static boolean isPrime(int n)
    {
        if(n<1)
        {
            return false;
        }

        int c=2;
        while (c*c<=n)
        {
            if (n%c==0)
            {
                return false;
            }
            c++;
        }

        return true;
    }
}
