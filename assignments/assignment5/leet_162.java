package com.assignments.assignment5;

public class leet_162 {
    public static void main(String[] args) {
        System.out.println("finding peak");
        int [] arr ={1,2,1,3,4,5};
        System.out.println(findPeakElement(arr));
    }
    static int findPeakElement(int[] nums) {
        int start =0;
        int end = nums.length-1;
        while(start<end)
        {
            int mid = (start+end)/2;
            if(nums[mid]<nums[mid+1])
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }
        }
        return start;
    }
}
