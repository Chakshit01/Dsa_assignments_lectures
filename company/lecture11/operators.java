package com.company.lecture11;

import com.company.lecture5.Arraylist;

import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));

        System.out.println("a"+1);
        String ans = new Integer(56) + "" + new ArrayList<>();//will print integer and a new list which is empty
        System.out.println(ans);
    }
}
