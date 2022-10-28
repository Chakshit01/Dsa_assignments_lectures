package com.assignments.ass3;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        System.out.println("Checking pythagoran triplet");
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean ans=maximum(a,b,c);
        System.out.println("Is the triplet pythgoran: " +ans);

    }
    static boolean maximum(int a,int b,int c){
        if (a>b && a>c)
        {
            String res =a+" is the greatest";
            System.out.println(res);
            return ((b*b)+(c*c)==(a*a));

        }
        else if (a<b && b>c){
            String res=b+" is the greatest";
            System.out.println(res);
            return ((a*a)+(c*c)==(b*b));

        }
        else {
            String res=c+" is the greatest";
            System.out.println(res);
            return ((b*b)+(a*a)==(c*c));

        }
    }
}
