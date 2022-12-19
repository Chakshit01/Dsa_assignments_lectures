package com.practice;

public class binarySearch {
    public static void main(String[] args) {
        System.out.println("Searching using the binary search");
        int [] arr = { 2,4,5,6,7,8};
        int target = 6;
        System.out.println("Index of the target element:"+binarySearch(arr,target));
    }

    static int binarySearch(int [] arr, int target)
    {
        int start=0;
        int end =arr.length;
        while (start<end)
        {
            int mid=start+(end-start)/2;
            if (target<arr[mid])
            {
                end=mid-1;
            }
            else if (target>arr[mid])
            {
                start =mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
