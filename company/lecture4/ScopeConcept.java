package com.company.lecture4;

public class ScopeConcept {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;

        {
//            block scoping
//            int a = 50;//it will display array because 'a' is already initialized outside the scope.

               a=60;// this can be done as we can change the original value of the integer a that is created outside this block.

        }
        System.out.println(a);// value = 60

        for ( int i=0;i<38;i++)
        {
//            loop scoping
            System.out.println(i);
            int x = 55;
            b=56;
        }
        System.out.println(b);
//      System.out.println(x); this statement will give error because x is defined inside the function scope hence cant be used outside
    }

}
