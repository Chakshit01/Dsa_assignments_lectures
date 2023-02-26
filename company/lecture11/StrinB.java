package com.company.lecture11;

public class StrinB {
    public static void main(String[] args) {
        System.out.println("StringBuilders");
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<26;i++)
        {
            char ch =(char) ('a'+i);
            builder.append(ch);

        }
        System.out.println(builder.toString());// printing builder and converting it into string
    }
}
