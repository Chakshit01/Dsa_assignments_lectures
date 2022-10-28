package com.company.lecture2;

import java.beans.PropertyEditorManager;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Reversing a number: ");
        int a = 586758;
        int ans = 0;
        while (a>0)
        {
            int rem =a%10;
             ans = (ans*10)+rem;
            a=a/10;
        }
        System.out.println("Reverse of the number is: "+ans);
    }
}
