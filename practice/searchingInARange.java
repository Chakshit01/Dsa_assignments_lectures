package com.practice;

public class searchingInARange {
    public static void main(String[] args) {
        System.out.println("Searching in a Range");
        int [] arr={1,2,3,4,45,5,56};
        int target=45;
        System.out.println(RangeSearch(arr,target,3,6));
    }
    static int RangeSearch(int []arr,int target,int start,int end)
    {
        if (arr.length == 0) {
            return -1;
        }
        for (int i=start;i<=end;i++)
        {
            int element = arr[i];
            if (element==target)
            {
                return i;
            }
        }
        return -1;
    }
}
