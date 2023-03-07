package com.assignments.assignment5;

public class leet_81 {
    public static void main(String[] args) {
        int target=0;
        int [] arr ={2,3,3,4,5,0,0,1,2};
        System.out.println(search(arr, target));
    }

    static boolean search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(nums[mid]==target)
                return true;
            if((nums[mid]==nums[low])&&(nums[high]==nums[mid]))
            {
                low++;
                high--;
            }
            else if (nums[mid]>=nums[low])
            {
                if(target>=nums[low]&&target<nums[mid])
                    high = mid-1;
                else
                    low = mid+1;
            }
            else
            {
                if(target>nums[mid]&&target<=nums[high])
                    low = mid+1;
                else
                    high = mid-1;
            }
        }
        return false;
    }


}

