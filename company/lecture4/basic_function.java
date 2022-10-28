package com.company.lecture4;

import java.util.Scanner;

public class basic_function {
    public static void main(String[] args) {
        //function calling
        sum();
    }
    //Creating a function
    static void sum() //use of void if there is no returning value of the function
     {
        // Body of a function
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c= a+b;
        System.out.println("sum= "+ c );// return value of the function
    }
}
