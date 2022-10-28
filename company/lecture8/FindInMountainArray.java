package com.company.lecture8;

public class FindInMountainArray {
    public static void main(String[] args) {
        System.out.println("Find in the mountain Array");
        int []arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr, int target)
    {
        int peak=PeakIndex(arr);
        int firstHalf=oderAgnostic(arr,target,0,peak);
        if (firstHalf!=-1)
        {
            return firstHalf;
        }
//        else it will return from the second half
        return oderAgnostic(arr,target,peak+1,arr.length-1);
    }
    static int oderAgnostic(int[]arr,int target,int start,int end)
    {

        boolean isAsc=arr[start]<arr[end];
        while (start<end)
        {
            int mid=start+(end-start)/2;
            if (target==arr[mid])
            {
                return mid;
            }
            if (isAsc)
            {
                if (target<arr[mid])
                {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            else
            {
                if (target<arr[mid])
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    static int PeakIndex(int[]arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if (arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return end;
    }
}
