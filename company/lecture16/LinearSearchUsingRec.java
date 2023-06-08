package com.company.lecture16;

public class LinearSearchUsingRec {
    public static void main(String[] args) {
        System.out.println("Linear Search using Recursion");
        int []arr ={1,2,43,56,7,87};
        int target = 97;
        System.out.println(Search(arr,target,0));
    }

    static int Search(int []arr,int target,int s)
    {
        if(arr[s]==target)
        {
            return s;
        }
        if(s==arr.length-1)
        {
            return -1;
        }

        return Search(arr,target,s+1);
    }
}
