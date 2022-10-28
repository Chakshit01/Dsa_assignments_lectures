package com.assignments.ass4;

public class Q7 {
    public static void main(String[] args) {
        System.out.println("Number of good pairs:");
        int [] nums={1,2,3,1,1,3};
        int count =0;
        for (int i =0;i<nums.length;i++)
        {
            for (int j=0;j<nums.length;j++)
            {
                if (nums [i] == nums[j] && i<j)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    }

