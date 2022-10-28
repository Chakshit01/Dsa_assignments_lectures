package com.assignments.ass4;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("getConcantenation");
        int [] num = new int[5];
        System.out.println(Arrays.toString(num));
        int n = num.length;
        int [] ans = new int[2*n];
        for (int i=0; i<n; i++)
        {
            ans[i]=num[i];
            ans[i+n]=num[i];

        }
        System.out.println(Arrays.toString(ans));

    }

}
