package com.company.lecture9;

import java.util.Arrays;

public class sortedMatrix {
    public static void main(String[] args) {
        System.out.println("Searching in sorted matrix");
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 7;
        System.out.println(Arrays.toString(search(matrix,target)));
    }

    static int [] binarySearch(int [][] matrix, int cStart, int cEnd,int row , int target)
    {
        while (cStart<=cEnd)
        {
            int mid = cStart+(cEnd-cStart)/2;
            if (matrix[row][mid]==target)
            {
                return new int[] {row,mid};
            }
            if (matrix[row][mid]>target)
            {
                cEnd=mid-1;
            }
            else
            {
                cStart=mid+1;
            }
        }
        return new int[]{-1,-1};
    }

//    make a function to find the element in the sorted matrix
    static int [] search(int [][] matrix,int target)
    {
        int rows=matrix.length;
        int cols=matrix[0].length; // be cautious that may be the matrix is empty

        if (rows==1)
        {
            return binarySearch(matrix,0,cols-1,0,target);

        }

//   run the loop till there are two rows are remaining
        int rStart=0;
        int rEnd=rows-1;
        int cMid = cols/2;

        while (rStart<(rEnd-1))
        {
            int mid=rStart+(rEnd-rStart)/2;
            if (matrix[mid][cMid]==target)
            {
                return new int[] {mid,cMid};
            }
            if (matrix[mid][cMid]>target)
            {
                rEnd = mid;
            }
            else
            {
                rStart=mid;
            }

//            now we have two rows
//            check weather the target is in two rows

//            first of all checking the middle rows
            if (matrix[rStart][cMid]==target)
            {
                return new int[] {rStart,cMid};
            }
            if (matrix[rStart+1][cMid]==target)
            {
                return new int[] {rStart+1,cMid};
            }

//            Now checking all the four cases
//            Checking the first half

            if (target<=matrix[rStart][cMid-1])
            {
                return binarySearch(matrix, 0,cMid-1,rStart,target);
            }

//            search in the second half
            if (target>=matrix[rStart][cMid+1]&&target<=matrix[rStart][cols-1])
            {
                return binarySearch(matrix,cMid+1,cols-1,rStart,target);
            }

//            search in the third half
            if (target<=matrix[rStart+1][cMid-1])
            {
                return binarySearch(matrix,0,cMid-1,rStart+1,target);
            }

//            search in the fourht half
            else
            {
                return binarySearch(matrix,cMid+1,cols-1,rStart+1,target);
            }
        }

        return new int[] {-1,-1};
    }

}
