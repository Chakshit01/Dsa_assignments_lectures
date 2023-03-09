package com.assignments.assignment5;

public class leet_153 {
    public static void main(String[] args) {
        System.out.println("finding minimum");
        int [] arr = {3,4,5,1,2};
        System.out.println(findMin(arr));
    }

    static int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high)
        {
            int mid=(high+low)/2;
            if(nums[high]<nums[mid])
            {
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return nums[low];
    }
}
