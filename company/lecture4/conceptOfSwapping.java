package com.company.lecture4;

import java.util.Scanner;

public class conceptOfSwapping {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int a =in.nextInt();
        int b = in.nextInt();

       int temp = a ;
        a=b;
        b=temp;
        System.out.println(a+ "" +b);
    }
}
