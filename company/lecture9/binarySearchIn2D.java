package com.company.lecture9;

import java.util.Arrays;

public class binarySearchIn2D {
    public static void main(String[] args) {
        System.out.println("Binary search in 2d Arrays");
        int [][] matrix ={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}

        };
        int target =35;
        System.out.println(Arrays.toString(search(matrix,target)));
    }
    static int [] search(int [][] matrix, int target)
    {
        int row =0;
        int col =matrix.length-1;

        while (row<matrix.length && col >=0)
        {
            if (matrix[row][col]==target)
            {
                return new  int []{row,col};
            }
            if (matrix[row][col]<target)
            {
                row++;
            }
            else if (matrix[row][col]>target)
            {
                col--;
            }
        }
        return new int[]{-1,-1};
    }

}
