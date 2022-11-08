package com.assignments.assignment5;

import java.util.Arrays;

public class Search_a_2D_matrix {
    public static void main(String[] args) {
        System.out.println("Searching a 2d matrix");
        int [][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target=5;
        System.out.println(searchMatrix(matrix,target));
    }

    static boolean binarySearch(int [][] matrix, int target,int row,int cStart,int cEnd)
    {
//        checking in the single row
//        setting up the middle element
        int mid =cStart+(cEnd-cStart)/2;
        while (cStart<=cEnd) {
            if (matrix[row][mid] == target) {
                return true;
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            }
            if (matrix[row][mid] > target) {
                cEnd = mid - 1;
            }
        }
        return false;
    }

    static boolean searchMatrix(int[][] matrix, int target)
    {
//        defining the no of rows
        int rows=matrix.length;
//        defining no of columns
        int cols=matrix[0].length;

        if (rows == 1) {
            return binarySearch(matrix,target,0,0,cols-1);

        }

//        run the loop till there are two rows left
        int rStart=0;
        int rEnd=rows-1;
//       to find the middle columns
        int cMid=cols/2;

        while (rStart < (rEnd)) {
            int mid= rStart+(rEnd-rStart)/2;
            if (matrix[mid][cMid]==target)
            {
                return true;
            }
            if (matrix[mid][cMid] < target) {
                rStart=mid;
            }
            else {
                rEnd=mid;
            }

//            now we are left with two rows

//            check weather the element is present in the two rows
            if (matrix[rStart][cMid] == target) {
                return true;
            }
            if (matrix[rStart + 1][cMid] == target) {
                return true;
            }

//            now check the other four cases
//            checking the first case
            if (target<=matrix[rStart][cMid-1]){
                return binarySearch(matrix,target,rStart,0,cMid-1);
            }
//            checking the second case
            if (target>=matrix[rStart][cMid+1]&&target<=matrix[rStart][cols-1])
            {
                return binarySearch(matrix,target,rStart,cMid+1,cols-1);
            }
//            checking the third case
            if (target<=matrix[rStart+1][cMid-1])
            {
                return binarySearch(matrix,target,rStart+1,0,cMid-1);

            }
//            checking the fourth case
            else
            {
                return binarySearch(matrix,target,rStart+1,cMid+1,cols-1);
            }

        }
        return false;
    }
}
