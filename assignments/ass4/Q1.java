package com.assignments.ass4;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Building Array from permutation");
        int[] nums ={0,2,1,5,3,4};
        int [] ans = BuildArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int [] BuildArray(int[] nums)
    {
        int n = nums.length;
        int [] ans= new int[n];
        for (int i=0;i<n;i++)
        {
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}
