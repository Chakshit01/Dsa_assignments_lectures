package com.assignments.assignment6;

import java.util.Arrays;

public class leet_1331 {
    public static void main(String[] args) {
        System.out.println("find the rank of the number");

        int [] arr = {40,10,20,30};
         int [] ans = arrayRankTransform(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] arrayRankTransform(int[] arr) {
        int [] ans = new int[arr.length];
        bubbleSort(arr);
        for (int i=0;i<arr.length;i++)
        {
            if(arr[0]==arr[arr.length-1])
            {
               int j=0;
               while (j<arr.length)
               {
                   ans[j]=1;
                   j++;
               }
            }
            else
            {
                ans[i]=i+1;
            }
        }
        return ans;
    }

    static void bubbleSort(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length-1;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
