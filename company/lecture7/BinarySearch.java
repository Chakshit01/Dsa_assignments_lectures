package com.company.lecture7;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("binary search");
          int  [] arr = {5,6,7,8,56,57,67,87};
          int target = 67;
          int ans = binarySearch(arr,target);
        System.out.println("index number of the target value " + ans);

    }
    static int binarySearch(int[]arr,int target)
    {
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
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
//                returning the answer
                return mid;
            }
        }
        return -1;
    }

}
