package com.assignments.ass3;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        System.out.println("Printing the result of the class");
        Scanner in = new Scanner(System.in);
        float marks = in.nextFloat();

        String ans = grade(marks);
        System.out.println("Grade is: "+ans);
    }

    static String grade(float marks)
    {
         if (marks<=100 && marks>=91)
         {
             String gr = "AA";
             return gr;
         }
        if (marks<=90 && marks>=81)
        {
            String gr = "AB";
            return gr;
        }
        if (marks<=80 && marks>=71)
        {
            String gr = "BB";
            return gr;
        }
        if (marks<=70 && marks>=61)
        {
            String gr = "BC";
            return gr;
        }
        if (marks<=60 && marks>=51)
        {
            String gr = "CD";
            return gr;
        }
        if (marks<=50 && marks>=41)
        {
            String gr = "DD";
            return gr;
        }
        else
        {
            String gr = "FAIL";
            return gr;
        }


    }
}
