package com.company.lecture5;

import java.util.ArrayList;
import java.util.Scanner;

public class multidimensionalArray {
    public static void main(String[] args) {
        System.out.println("Creating multidimensional Array");
        Scanner in =new Scanner(System.in);

                          /*  SYNTAX     */
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();

//        intializing Arraylist that has to filled

        for (int i=0; i<3;i++) //we will add three Arraylists
        {
            list.add(new ArrayList<>());
        }

//        Now adding elements to the Arraylists

        for (int i=0; i<3;i++)  // this represents the number of the Arraylists
        {
            for (int k=0;k<2;k++)  // this represents the number of elements
            {
                list.get(i).add(in.nextInt());
            }
        }

//        Printing the Multidimensional Arraylist
        System.out.println(list);
    }
}
