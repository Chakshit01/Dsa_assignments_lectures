package com.assignments.ass4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("kids with the maximum candies");
        Scanner in = new Scanner(System.in);

        int maxVal=0;
        System.out.println("Enter the size of candies arrays:");
        int size = in.nextInt();
        System.out.println("Enter the number of extra candies");
        ArrayList<Boolean> result =new ArrayList<>();


        int extraCandies=in.nextInt();
        int[] candies=new int[size];
        System.out.println("Now enter the elements of the Array");
        for (int i=0;i<size;i++)
        {
             candies[i]=in.nextInt();
        }
        for(int i=0;i<candies.length;i++)
        {
            boolean test =false;
            for(int j=0;j<candies.length;j++)
            {
                if (candies[i]+extraCandies<candies[j])
                {
                    test = true;
                    break;
                }
            }
            if (test)
            {
                result.add(false);
            }
            else{
                result.add(true);
            }
        }
        System.out.println(result);;
    }


}
