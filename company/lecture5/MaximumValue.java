package com.company.lecture5;

public class MaximumValue {
    public static void main(String[] args) {
        System.out.println("Printing the maximum value of the array:");
        int arr[] = {1,2,6,4,5,76,83};
        int sol = maxRange(arr, 1,4); // function calling
        System.out.println(sol );

    }
      static int maxRange(int arr[],int start , int end)  // creating a function
      {
          int maxVal=arr[0]; // set the index no 0 as the maximum value

          for (int i=start; i< end;i++)
          {
              if (arr[i]>maxVal){
                  maxVal=arr[i];
              }
          }
          return maxVal;
      }
}
