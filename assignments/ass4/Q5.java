package com.assignments.ass4;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Shuffling the Array");
        int []arr={1,2,3,4,5,6};

        int n=(arr.length)/2;
        System.out.println(Arrays.toString(arr));
        // new array to be formed is {1,4,2,5,3,6}

//        creating the shuffled array named ans
        int [] ans=new int[arr.length];
        int j=0;
        for (int i=0;i<arr.length;i=i+2)
        {
            ans[i]=arr[j];
            ans[i+1]=arr[j+n];
            j++;
        }

        System.out.println(Arrays.toString(ans));


    }

}
