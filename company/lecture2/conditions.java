package com.company.lecture2;

import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();


//        if (a>4){
//            a+=2;
//        }
//        else
//        {
//            a+=5;
//        }


//        multiple if else statements
        if (a>5&&a<7)
        {
            a+=5;
        }
        else if (a>7)
        {
            a+=10;
        }
        else
        {
            a+=4;
        }
        System.out.println(a);
    }
}
