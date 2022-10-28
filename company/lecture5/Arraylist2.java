package com.company.lecture5;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist2 {
    public static void main(String[] args) {
        System.out.println("Printing Arraylist");
        Scanner in = new Scanner(System.in);


               /*        syntax    */

//        pointing angle brackets <> stores the wrapper class not the primitive datatype such as int , long, char
        ArrayList<Integer> list = new ArrayList<>(10);
//        Adding elements in the Array list
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(550);
        list.add(40);
        list.add(330);

        System.out.println(list);

        list.remove(2);//will remove the object from the 2nd index
        System.out.println(list.contains(330)); //will check whether the list contains 330 or not
        list.set(5,60);//will set the value of 60 on the 5th index

        System.out.println(list);

        /* Adding multiple objects by using functions */

//        inserting the elements by initializing 'i' as an index
        for (int i =0; i<5;i++)
        {
            list.add(in.nextInt());
        }

//       getting the elements
        for (int i =0; i<5;i++)
        {
            list.get(i);
        }

        System.out.println(list);







    }
}
