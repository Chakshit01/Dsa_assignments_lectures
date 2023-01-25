package com.company.lecture10;

//Amazon Problem
//leetcode 268 question

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class Leet_268 {
    public static void main(String[] args) {
        System.out.println("Missing Element");
        int [] arr={4,0,2,1};
        missingNumber(arr);
        System.out.println(missingNumber(arr));

    }

    static int missingNumber(int [] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i];
            if (arr[i]<arr.length && arr[i]!=arr[correct])
            {
                swap(arr,i,correct);

            }
            else
            {
                i++;
            }
        }

        for (int index =0; index<arr.length;index++)
        {
            if (arr[index] != index)
            {
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}