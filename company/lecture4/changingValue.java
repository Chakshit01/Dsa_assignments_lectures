package com.company.lecture4;

import java.util.Arrays;

public class changingValue {
    public static void main(String[] args) {
        System.out.println("Changing the value of the array");
        int[] arr = {1,2,3,4,5,6,7};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums)
    {
        nums[0]=99;
        nums[3]=75;
    }
}
