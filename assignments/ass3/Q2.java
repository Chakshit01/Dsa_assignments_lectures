package com.assignments.ass3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Even or odd using functions");
        Scanner in= new Scanner(System.in);
        int a = in.nextInt();
        evod(a);
    }
    static void evod(int a)
    {
        if(a%2==0){
            System.out.println(a+" is even");
        }
        else
        {
            System.out.println(a+" is odd");
        }
    }
}
