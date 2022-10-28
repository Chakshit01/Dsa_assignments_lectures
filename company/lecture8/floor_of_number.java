package com.company.lecture8;

public class floor_of_number {
    public static void main(String[] args) {
        System.out.println("Floor of a number");
        int [] arr = {12,23,45,56,76,78,89};
        int target = 60;
        int ans = floor_of_number(arr,target);
        System.out.println("Floor of the number is on the "+ans+" index");
    }

    static  int floor_of_number(int [] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start+(end-start)/2;
            if (target < arr  [mid]) {
                end=mid-1;
            } else if (target > arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}
