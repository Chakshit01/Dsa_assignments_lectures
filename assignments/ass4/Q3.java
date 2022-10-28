package com.assignments.ass4;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Running sum of an array:");
        int[] nums = {1,2,3,4};
        int[] ans = new int[nums.length];

        int k=0;
        for (int i=0;i<(nums.length);i++)
        {

            k=nums[i]+k;
            ans [i]=k;

        }
        System.out.println(Arrays.toString(ans));
    }
}
