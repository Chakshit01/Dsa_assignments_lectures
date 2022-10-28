package com.company.lecture5;

import java.util.Arrays;

public class SwappingArr {
    public static void main(String[] args) {
        System.out.println("Swapping the arrays");
        int arr[] = {1,2,3,4,5};
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int arr[], int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]=temp;

    }
}
