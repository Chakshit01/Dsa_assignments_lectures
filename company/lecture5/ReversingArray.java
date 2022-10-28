package com.company.lecture5;

import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        System.out.println("Reversing an array:");
        int [] arr = {1,23,45,76,92,85};
        reverse(arr);// function calling
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr){
        int start =0;
        int end= arr.length-1;
        while (start<end) {
            swap(arr,start,end  );
            start++;
            end--;

        }
    }
    static void swap(int [] arr, int index1 , int index2){
        int temp = index1;
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
}
