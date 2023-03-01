package com.assignments.assignment6;

import java.util.ArrayList;
import java.util.Arrays;

public class leet_905 {
    public static void main(String[] args) {
        System.out.println("Sort Array by parity");
        int [] nums = {2,3,4,5,6,7};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
    static int[] sortArrayByParity(int[] nums) {
        if(nums.length<=1) {
            return nums;
        }

        int end_index=nums.length-1;

        for(int i=0;i<nums.length && i<=end_index;i++){
            if(nums[i]%2!=0){
                int temp=nums[i];
                nums[i]=nums[end_index];
                nums[end_index]=temp;
                end_index--;
                i--;
            }
        }
        return nums;
    }
}
