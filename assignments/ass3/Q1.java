package com.assignments.ass3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        String ans=maximum(a,b,c);
        System.out.println(ans);

    }
    static String maximum(int a,int b,int c){
        if (a>b && a>c)
        {
            String res ="a is the greatest";
            return res;
        }
        else if (a<b && b>c){
            String res="b is the greatest";
            return res;
        }
        else {
            String res="c is the greatest";
            return res;
        }
    }
}
