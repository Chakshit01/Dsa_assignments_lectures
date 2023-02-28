package com.assignments.assignment6;

public class leet_628 {
    public static void main(String[] args) {
        System.out.println("To find the product of maximum three numbers in the array");
        int [] arr={-100,-98,-1,2,3,4};
        System.out.println(maximumProduct(arr));
    }
    static int maximumProduct(int[] nums) {
         bubbleSort(nums);
         int prod =1;
         int count =0;
         for (int i=0;i<nums.length;i++)
         {
             int start=i;
             int end=nums.length-i-1;
             int max=getMax(nums,0,end);
              prod = prod*max;
             count++;
             if (count==3)
             {
                 break;
             }
         }
         return prod;
    }

    static int getMax(int []arr,int start,int end)
    {
        int max = arr[0];
        for (int i=1;i<=end;i++)
        {
            if (arr[i-1]<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }

    static  void bubbleSort(int []arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            for (int j=1;j<arr.length-i;j++)
            {
                if (arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
