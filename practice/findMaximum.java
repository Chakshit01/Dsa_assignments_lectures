package com.practice;

public class findMaximum {
    public static void main(String[] args) {
        System.out.println("Find maximum in Array");
        int [] arr= {3,4,2,1,5,7};
        System.out.println(findMax(arr));
    }
    static int findMax(int []arr)
    {
        int sol=arr[0];
        for (int i=1;i<arr.length;i++) {
            if (arr[i] > sol) {
                sol=arr[i];
            }
        }
        return sol;
    }
}
