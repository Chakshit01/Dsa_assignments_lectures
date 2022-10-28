package com.company.lecture2;

import java.util.Scanner;

public class LargestNumbers {
    public static void main(String[] args) {
        System.out.println("Finding out the largest numbers:-)");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers:- ");
        System.out.print("num 1:");
        int a = in.nextInt();
        System.out.print("num 2:");
        int b = in.nextInt();
        System.out.print("num 3:");
        int c = in.nextInt();


        int max = a;
        if (b>max){
            max = b;
        }
        if (c>max){
            max = c;

        }

        System.out.println("Maximum number is: "+max);

//         Using Math.max library
//        System.out.println(Math.max(a,Math.max(b,c)));


    }
}
