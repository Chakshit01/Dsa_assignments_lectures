package com.assignments.ass3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Eligibility for voting");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        canVote(age);
    }
    static void canVote(int age)
    {
        if (age>18)
        {
            System.out.println("Can vote");
        }
        else
        {
            System.out.println("Cant vote");
        }
    }
}
