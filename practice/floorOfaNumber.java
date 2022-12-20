package com.practice;

public class floorOfaNumber {
    public static void main(String[] args) {
        System.out.println("To find the ceiling of the number");
        int [] arr= {12,14,15,17,23,34};
        int target= 16;
        System.out.println("Ceiling of the target is at the index no: "+findCeiling(arr,target));

    }

    static int findCeiling(int []arr, int target)
    {
        int start=0;
        int end = arr.length-1;
        while (start <= end) {
            int mid= start+(end-start)/2;
            if (target > arr[mid]) {
                start=mid+1;
            } else if (target < arr[mid]) {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return end;
    }
}
