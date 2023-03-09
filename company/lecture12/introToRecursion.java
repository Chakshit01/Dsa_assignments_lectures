package com.company.lecture12;public class introToRecursion {

    public static void main(String[] args) {
        System.out.println("intro to recursion");
        func(1);

    }
    static void func(int n)
    {
//        base condition
        if(n==5)
        {
            System.out.println(5);
            return;
        }
        System.out.println(n);

    }
}
