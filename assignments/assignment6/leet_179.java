package com.assignments.assignment6;

import java.util.ArrayList;
import java.util.Arrays;

public class leet_179 {
    public static void main(String[] args) {
        System.out.println("Printing Maximum");
        int [] arr ={10,2};
        ArrayList <Integer> ans= GetMax(arr);
        System.out.println(ans);
    }

    static ArrayList<Integer>  GetMax(int[]arr)
    {
        ArrayList<Integer> ans =new ArrayList<>();

        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>9)
            {
                int n= arr[i];
                int rem = n%10;
                n=n/10;
                ans.add(n);
                if (rem!=0) {
                    ans.add(rem);
                }
            }
            else {
                ans.get(i);
            }
        }
        return ans;

    }
}
