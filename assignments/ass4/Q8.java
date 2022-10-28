package com.assignments.ass4;

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        System.out.println("Check how many numbers are smaller than the Current number");
        int [] arr={8,1,2,2,3};
        int [] ans=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]> arr[j]) {
                    count++;
                }
            }
            ans[i]=count;
        }
        System.out.println(Arrays.toString(ans));
    }
}
