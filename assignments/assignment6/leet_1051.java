package com.assignments.assignment6;

public class leet_1051 {

    public static void main(String[] args) {
        System.out.println("Height checker");
        int [] heights ={1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }

    static int heightChecker(int[] heights) {

        int l=heights.length;
        int [] sortedArr= new int[heights.length];
        System.arraycopy(heights,0,sortedArr,0,l);
        bubbleSort(sortedArr);
        int count= 0;
        for(int i=0;i<heights.length;i++)
        {

            if(heights[i]!=sortedArr[i])
            {
                count++;
            }
        }

        return count;
    }

    static void bubbleSort(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
