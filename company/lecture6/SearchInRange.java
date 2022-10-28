package com.company.lecture6;

public class SearchInRange {
    public static void main(String[] args) {
        System.out.println("Search In Range");
        int[] arr={12,-7,13,14,16,23};
        int target = 14;
        System.out.println(RangeSearch(arr,target,1,4));
    }

    static int RangeSearch(int[] arr, int target, int start, int end)
    {
        if (arr.length==0)
        {
            return -1;
        }
        for (int i=start;i<=end;i++)
        {
            int element=arr[i];
            if (element==target)
            {
                return i;
            }
        }
        return -1;
    }
}
