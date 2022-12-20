package com.practice;

public class ceilingOfaNumber {
    public static void main(String[] args) {
        System.out.println("Ceiling of a number");
        int [] arr={11,12,14,15,17,18,19};
        int target=16;
        System.out.println("ceiling of the target is at index no: "+findCeiling(arr,target));
    }

    static int findCeiling(int[] arr,int target)
    {
        int start=0;
        int end =arr.length-1;

        while (start <= end) {
            int mid=start+(end-start)/2;
            if (target>arr[mid])
            {
                start=mid+1;
            }
            else if (target<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return start;
    }
}
