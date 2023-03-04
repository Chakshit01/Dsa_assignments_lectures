package com.assignments.assignment5;

public class leet_1539 {

    public static void main(String[] args) {
        System.out.println("find the k'th missing element");
        int n=5;
        int [] arr = {1,2,3,4};
        System.out.println(findKthPositive(arr,n));
    }

    static int findKthPositive(int[] arr, int k)
    {
        int l=0,r=arr.length;
        while(l<r)
        {
            int mid=l+(r-l)/2;
            int mis=arr[mid]-(mid+1);
            // System.out.println(mis);
            if(mis>=k)
            {
                r=mid;
            }
            else
            {
                l=mid+1;
            }
        }
        // System.out.print(l);
        return l+k;
    }
}
