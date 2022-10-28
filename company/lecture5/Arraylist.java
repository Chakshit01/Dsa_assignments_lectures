package com.company.lecture5;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist  {
    public static void main(String[] args) {
        System.out.println("Creating an Array list");
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>(10); // Integer is the wrapper class , we cant use primitives here
        
        list.add(97);
        list.add(85);
        list.add(85);
        list.add(58);
        list.add(85);
        list.add(85);
        list.add(85);
        System.out.println(list);

        System.out.println(list.contains(97));
        list.set(2,27);

        list.remove(4);

//        taking input from the user in the arraylist
        for (int i =0; i<5; i++)
        {
            list.add(in.nextInt());
        }

        for (int i =0; i<5; i++)
        {
            System.out.println(list.get(i)); // pass index here
        }


        System.out.println(list);
        
    }
}
