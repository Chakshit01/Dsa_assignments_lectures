package com.company.lecture10;

public class leet_287 {
    public static void main(String[] args) {

    }

    public int findDuplicate(int[] nums)
    {
        int i=0;
        while(i<nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);

                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    void swap(int[] arr,int start,int end)
    {
        int temp= arr[start];
        arr[start]=arr[end];
        arr[end]= temp;
    }
}
