package com.company.lecture6;

public class maxValueIn2D {
    public static void main(String[] args) {
        System.out.println("Search in 2D Arrays");
        int [][] arr ={
                {1,2,34},
                {24,56,87,76},
                {45,34,7},
                {32,31,89,36}
        };
        int target=76;
        System.out.println(search2D(arr));

    }
    static int search2D(int [][] arr)
    {
        int max=Integer.MIN_VALUE;
        if (arr.length == 0) {
            return -1;
        }
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                if (arr[i][j]>max)
                {
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
    }

