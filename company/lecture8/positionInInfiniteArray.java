package com.company.lecture8;

public class positionInInfiniteArray {
    public static void main(String[] args) {
        System.out.println("Position in the infinite Array");
        int[] arr={2,3,5,6,7,8,10,11};
        int target=8;

        System.out.println(ans(arr,target));
    }
    static int ans(int [] arr,int target)
    {
//        initially taking the box of 2
        int start=0;
        int end=1;
//        updating the array
        while (target>arr[end])
        while (target>arr[end])
        {
             int temp=end+1;
             end=end+(end-start+1)*2;
             start=temp;

        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[]arr,int target,int start,int end)
    {
//        here we don't have to include the start and the end element as they will be changing while searching in the infinite array
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
