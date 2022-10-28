package com.company.lecture5;

import java.util.Arrays;
import java.util.Scanner;

public class TwodArrays {
    public static void main(String[] args) {
        System.out.println("Creating two dimensional arrays");
        Scanner in = new Scanner(System.in);
        int [][] arr = new int[3][2];
        int [][] arr2 = {{1,3,4,5},
                {34,23,45},
                {56,46,78}};
        for (int i=0; i<arr2.length;i++){
            System.out.println(Arrays.toString(arr2[i]));
        }

        for(int [] nums:arr2)
        {
            System.out.println(Arrays.toString(nums));
        }

        for (int row=0; row<arr.length; row++)
        {
            for (int col=0; col<arr[row].length; col++){
                arr[row][col]=in.nextInt();
            }
        }

        for (int [] sol:arr)
        {
            System.out.println(Arrays.toString(sol));
        }
    }
}
