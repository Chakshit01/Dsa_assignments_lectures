package com.company.lecture8;

public class Ceiling_of_number {
    public static void main(String[] args) {
        System.out.println("Ceiling of a number");
        int [] arr = {1,2,3,4,5,7,8,9};
        int target  = 6;
        int ans = Ceiling(arr,target);
        System.out.println("Ceiling of the number is " + ans + " index");
    }

    static int Ceiling(int[]arr,int target)
        {
        int start =0;
        int end = arr.length-1;



            while (start <=end) {
                int mid = start+(end-start)/2;
                if (target < arr[mid]) {
                    end=mid-1;
                } else if (target > arr[mid]) {
                    start=mid+1;
                }
                else{
                    return mid;
                }
            }
            return start;
    }

}
