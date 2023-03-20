package com.practice;

import java.util.Arrays;

public class rough {
    public static void main(String[] args) {
        int [] arr ={-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
   static int[] productExceptSelf(int[] nums) {

        int result [] = new int [nums.length];

        int runningProduct = 1;

        //left Pass
        for(int i = 0; i < nums.length; i++){

            result[i] = runningProduct;//for every index we will put runningProduct
            runningProduct = runningProduct * nums[i];//update the runningProduct
        }

        //rightPass
        //for rightPass Again update runningProduct as 1

        runningProduct = 1;

        for(int i = nums.length -1 ; i >= 0; i--){

            //multiply the value present on ith index with rightPass Value

            result[i] = result[i] * runningProduct;
            runningProduct = runningProduct * nums[i];//update the runningProduct
        }
        return result;
    }
}

