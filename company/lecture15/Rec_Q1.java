package com.company.lecture15;

public class Rec_Q1 {
    public static void main(String[] args) {
        System.out.println("Printing 1 to n using recursive approach");
//        fun(5);
        funRev(4);
    }

//    static void fun(int n)
//    {
//        if (n==0)
//        {
//            return;
//        }
//
//        System.out.println(n); // Will print the current number stored in n
//        fun(n-1);// will iterate the function again with decrement in the number ,
////                     suppose first the number was 5 after this function call
////                       n moves to n-1 i.e 4
//
//    }

    static void funRev(int n)
    {
        if (n==0)
        {
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
}
