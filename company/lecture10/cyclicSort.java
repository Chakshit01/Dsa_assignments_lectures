package com.company.lecture10;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        System.out.println("Cyclic Sort");
        int []arr = {5,2,3,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct =arr[i]-1;
             if (arr[i]!=arr[correct])
             {
                 swap(arr,i,correct);
             }
             else
             {
                 i++;
             }
        }
    }
    static void swap(int[] arr, int first, int second)
    {
        int temp= arr[first];
        arr[second]=arr[first];
        arr[first]=temp;

    }
}
