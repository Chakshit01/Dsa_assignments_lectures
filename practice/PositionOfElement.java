package com.practice;

import java.util.Arrays;

public class PositionOfElement {
    public static void main(String[] args) {
        System.out.println("Finding the position of the element: ");
        int [] nums={1,5,5,5,5,5};
        int target=5;
        int [] ans=searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int [] arr,int target)
    {
        int [] ans ={-1,-1};
        int start = findPosition(arr,target,true);
        int end= findPosition(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    static int findPosition(int [] arr, int target, boolean firstIndex)
    {
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while (start <= end) {
            int mid= start+(end-start)/2;
            if (target<arr[mid])
            {
                end=mid-1;
            }
            else if (target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                ans=mid;
                if (firstIndex){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
