package com.company.lecture8;

import javax.swing.*;

public class RotatedArray {
    public static void main(String[] args) {
        System.out.println("Search in the rotated Array:");
        int [] nums={4,5,6,7,0,1,2};
        int target=0;
        int ans =search(nums,target);
        System.out.println(ans);

    }
    static int search(int[] nums, int target){
        int Pivot=FindPivot(nums);
        if (Pivot==-1)
        {
            return binarySearch(nums,target,0,nums.length-1);
        }
//        Case 1: if Target is equal to pivot
        if (target ==Pivot) {
            return Pivot;
        }
//        Case 2: if Target is less than the start elements then avoid the starting elements before the pivot
//        do the binary search from the p+1 index (p=position of the pivot element)
        else if (target<=nums[0]){
            return binarySearch(nums,target,Pivot-1,nums.length-1);

        }
        //            Case 3: if target is greater than the starting elements then we can avoid the elements after the
//            pivot, do the binary searching starting from the 0th index till p-1 index
        return binarySearch(nums,target,0,Pivot-1);
    }
    static int binarySearch(int[]arr,int target,int start,int end)
    {

        while (start<=end){
            int mid=start+(end-start)/2;
            if (target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                return mid;

            }
        }
        return -1;
    }
    static int FindPivot(int[]arr)
    {
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;

//        Case 1:if middle element is greater than the (m+1) element
//        ex:[3,4,5,6,7,0,1,2,3],here middle element is 7 and it is greater than the m+1 element and also the pivot
//        therefore will be caught in this loop
            if (mid<end&&arr[mid]>arr[mid+1]){
                return mid;
            }
/*        Case 2:if middle element is less than the m-1 element than it's possible that the previous element
*           can be the pivot for ex:[4,5,0,1,2] here 0 is the mid element and is just smaller than the m-1
*           element and that is pivot element that will caught in this loop*/
            else if (mid>start&&arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
//         Case 3:if middle element is less than the starting elements then it means that all the elements after
//            the mid elements are smaller than the starting elements due to sorting hence we can ignore the
//            end elements by using the condition end=m-1;Array ex:[4,5,6,3,2,1,0], 3 is the mid element
            else if (arr[mid]<=arr[start]){
                end=mid-1;
            }
//            Case 4: if middle element is greater than the start elements than we can avoid the starting elements
//            before mid because they are smaller than the end elements and we want to find the greatest element
//            use the condition start=mid+1;Array ex:[3,4,5,6,2], here 5 is the middle element.
            else {
                start=mid+1;
            }

        }
        return -1;
    }
}
