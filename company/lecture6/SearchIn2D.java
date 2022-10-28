package com.company.lecture6;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        System.out.println("Search in 2D Arrays");
        int [][] arr ={
                {1,2,34},
                {24,56,87,76},
                {45,34,7},
                {32,31,89,36}
        };
        int target=76;
        System.out.println(Arrays.toString(search2D(arr,target)));

    }
    static int[] search2D(int [][] arr, int target)
    {
        if (arr.length == 0) {
            return new int[]{-1,-1};
        }
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                 if (arr[i][j]==target)
                 {
                     return new int[] {i,j};
                 }
            }
        }
        return new int[]{-1,-1};
    }
}
