package com.company.lecture8;

public class PeakIndex {
    public static void main(String[] args) {
        System.out.println("finding the peak index of the Array");
        int [] arr={1,2,3,4,5,4,3,2,1};
        int ans=binarySearch(arr);
        System.out.println(ans);

    }
    static int binarySearch(int [] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end)
        {
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1])
            {
                end=mid;

            }
            else {
                start=mid+1;

            }

        }
        return  start;
    }
}
