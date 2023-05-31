package com.company.lecture14;

import java.util.Arrays;

public class FindingPrimes {
    public static void main(String[] args) {
        System.out.println("Finding primes between 1 to 40");
        int n =40;
         boolean [] arr = new boolean[n+1];// initially the array will contain false for all the indices;
        seive(n,arr);
    }

    static void seive(int n,boolean [] primes)
    {
        for (int i=2;i*i<=n; i++)// initial condition of checking up primes
        {
            if(!primes[i])// if value of the corresponding index is false then enter
                 {
                for (int j = i * 2; j <= n; j += i)// setting condition for the indices to be marked true
                {
                    primes[j] = true;
                }
//                Value of false depicts the prime numbers
            }
        }
        for (int i=2;i<=n;i++) // printing the indices which have value of false starting from 2.
        {
            if (!primes[i])
            {
                System.out.println(i+" ");
            }
        }
    }
}
