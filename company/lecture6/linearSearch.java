package com.company.lecture6;

public class linearSearch {
    public static void main(String[] args) {
        System.out.println("Linear Search");
        int [] arr={1,2,3,4,5,56,8};
        int target =5;
        int ans=LinearSearch(arr,target);
        System.out.println(ans);
    }

    static int LinearSearch(int [] arr,int target)
    {
        if (arr.length==0)
        {
            return -1;
        }
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
