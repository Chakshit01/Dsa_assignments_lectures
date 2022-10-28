package com.company.lecture5;

import java.util.Arrays;
import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        System.out.println("Intro to array: ");
        Scanner in =new Scanner(System.in);

//        int []rnos=new int[5];
//        System.out.println(rnos[1]); // will print the value of first index in rnos array

      // it will store 5 roll numbers
//        System.out.println(Arrays.toString(rnos));
//       toString is a library that is used to print array
        int[] arr=new int[4];
        System.out.println(arr.length);// will print the length of the array


        for (int i=0;i< arr.length;i++) {
            arr[i] = in.nextInt();
        }

        // using enhanced 'for' loop
        for (int j : arr) { // for every index of an array it will print the element
            System.out.println(j + ""); //here j represents the element in array;
         }
    }
}
