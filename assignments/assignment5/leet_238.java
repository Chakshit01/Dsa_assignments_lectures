package com.assignments.assignment5;

import java.util.Arrays;

public class leet_238 {
    public static void main(String[] args) {
        System.out.println("finding modified array");
        int [] arr ={0,0};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    static int[] productExceptSelf(int[] nums) {
        int [] ans = new int [nums.length];
        int product=1;
        // firstly take the product of all numbers present
        for(int i=0;i<nums.length;i++)
        {

            if(nums[i]!=0)
            {
               product = product * nums[i];
            }
            else{
                product=0;
            }
        }
        if(!checkZero(nums))
        {
            for(int i=0;i<nums.length;i++)
            {
                ans[i]=product/nums[i];
            }
        }
        else {
            for (int i=0;i<nums.length;i++)
            {
                if(nums[i]==0)
                {
                    ans[i]=product;
                }
                else {
                    ans[i]=0;
                }
            }

        }
        return ans;
    }

    static boolean checkZero(int [] nums)
    {
        for (int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                return true;
            }
        }
        return false;
    }
}
