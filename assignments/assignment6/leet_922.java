package com.assignments.assignment6;

import java.util.Arrays;

public class leet_922 {
    public static void main(String[] args) {
        System.out.println("Array Parity");
        int [] nums ={2,3,4,5,7,8};

        sortedSquares(nums);
        System.out.println(Arrays.toString(nums));
    }

    static int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];

        }
        bubbleSort(nums);
        return nums;
    }

    static void bubbleSort(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
