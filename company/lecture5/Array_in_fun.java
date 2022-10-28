package com.company.lecture5;

import java.util.Arrays;

public class Array_in_fun {

    public static void main(String[] args) {
        System.out.println("Arrays in functions: ");
        int nums[]  = {1,3,4,5,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int [] arr){
        arr[3]=99;//arrays are mutable in java

    }
}
