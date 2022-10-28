package com.company.lecture8;

import java.util.Arrays;

public class PositionOfElement {
    public static void main(String[] args) {
        System.out.println("Find the first and the last position of the element in the array");
        int [] nums  ={1,5,5,5,5,5,5};
        int target=5;
        int [] ans =searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target)
    {
        int [] ans ={-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    static int search(int [] nums, int target, boolean findFirstIndex)
    {
        int ans=-1;
        int start =0;
        int end = nums.length-1;
        while (start<=end)
        {
            int mid = start + (end-start)/2;
            if (  target>nums[mid]) {

                start=start+1;
            }
            else if (target<nums[mid]){
                end=end-1;
            }
            else
            {
//                This is the potential answer that can be the first index of the target element
                ans=mid;
                if (findFirstIndex) {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }


}
