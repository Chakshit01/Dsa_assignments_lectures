package com.company.lecture7;

public class order_Agnostic {
    public static void main(String[] args) {
        System.out.println("order agnostic method");
        int [] arr ={89,78,67,56,45,34,23,12};
        int target=34;
        int ans = oderAgnosticBS(arr,target);
        System.out.println(ans);
    }

    static int oderAgnosticBS(int[] arr,int target)
    {
        int start =0;
        int end = arr.length-1;
//        find whether the array is sorted in ascending or descending
        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            int mid = start+(end-start)/2;

            if (arr[mid]==target){
                return mid;
            }

            if (isAsc) {
                if (target>arr[mid])
                {
                    start=mid+1;
                }
                else if (target<arr[mid])
                {
                    end=mid-1;
                }
            }
            else {
                if (target< arr[mid])
                {
                    start=mid+1;
                }
                else if (target>arr[mid])
                {
                    end=mid-1;
                }
            }
        }
       return -1;
    }
}
