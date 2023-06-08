package com.company.lecture15;

public class countZeros {
    public static void main(String[] args) {
        System.out.println("counting number of zeros");
        System.out.println(count(302004));
    }

    static int count(int n)
    {
        return helper(n,0);
    }

    static int helper(int n,int count)
    {
        if(n==0)
        {
            return count;
        }

        if(n%10==0)
        {
            return helper(n/10,count+1);
        }
        return helper(n/10,count);

    }
}
