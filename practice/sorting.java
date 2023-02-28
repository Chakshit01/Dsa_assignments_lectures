package com.practice;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        System.out.println("Types of Sorting");
        int [] arr={5,2,1,3,4};
//        bubbleSort(arr);
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int [] arr)
    {
        boolean sorted;
        for (int i=0;i<arr.length;i++)
        {
            sorted = false;
            for (int j=1;j<arr.length-i;j++)
            {
                if (arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                    sorted=true;
                }
            }
            if (!sorted)
            {
                break;
            }
        }

    }

    static void selectionSort(int [] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static int getMaxIndex(int [] arr,int start,int end)
    {
        int max = arr[start];
        for (int i=start;i<= end;i++)
        {

            if (arr[max]<arr[i])
            {
                max = i;
            }

        }
        return max;
    }

    static void swap(int[]arr,int first, int end)
    {
        int temp=arr[first];
        arr[first]=arr[end];
        arr[end]=temp;
    }
}
