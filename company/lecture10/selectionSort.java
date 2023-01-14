package com.company.lecture10;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        System.out.println("Selection Sort");
        int []arr ={4,5,1,2,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int []arr)
    {
        for (int i=0;i<arr.length;i++)
        {
//            swap the highest number to the highest index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int [] arr,int first, int second)
    {
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static int getMaxIndex(int []arr,int start, int end)
    {
        int max = start;
        for (int i=start;i<=end;i++)
        {
            if (arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }
}



