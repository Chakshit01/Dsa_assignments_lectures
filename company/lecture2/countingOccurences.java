package com.company.lecture2;

public class countingOccurences {
    public static void main(String[] args) {
        System.out.println("Counting occurences in the number:");
        long a = 1343435353;
        int count = 0;
        while (a>0)
        {
            long rem = a % 10 ;
            if (rem == 3)
            {
                count++;
            }
            a=a/10;

        }
        System.out.println("the number occurs "+count+ " times");
    }
}
