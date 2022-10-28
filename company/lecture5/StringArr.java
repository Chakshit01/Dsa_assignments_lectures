package com.company.lecture5;

import java.util.Arrays;
import java.util.Scanner;

public class StringArr {
    public static void main(String[] args) {
        System.out.println("Creating a String array");
        Scanner in = new Scanner(System.in);
        String[] arr= new String[4];
        String [] arr2= {"Ram","Shyam","Tom","Rex","ria"};
        arr2[2]="Rahul";
        System.out.println(Arrays.toString(arr2));

//        Taking input for a String array
        for (int i =0;i<arr.length;i++)
        {
            arr[i]=in.next();
        }

        //way of printing
        /*   for (int i =0;i<arr.length;i++)
        {
            arr[i]=in.next();
        }
        */

        // enhanced method of printing array
        for (String j: arr){
            System.out.println(j+"");
        }

        // another method of printing String
//        System.out.println(Arrays.toString(arr));

    }
}
