package com.company.lecture5;

import java.util.Arrays;
import java.util.Scanner;

public class twoD {
    public static void main(String[] args) {
        System.out.println("Creating multidimensional arrays: ");
        Scanner in = new Scanner(System.in);

//        Declaring and defining the array
        int [][] arr = new int[3][2];
//        first bracket tells the no of rows and second bracket tells no of columns

        System.out.println(arr.length); // tells the size of the array(basically the number of arrays)

//        Creating another array
        int[][] arr2 ={
                {1,2,3}, // 1st index
                {4,5,6},// 2nd index
                {7,8,9}//  3rd index
        };

        System.out.println(arr2[1][0]); //will print 4

/*      Using simple way of printing 2d Array */

//        for (int i=0;i<arr2.length;i++)
//        {
//            System.out.println(Arrays.toString(arr2[i]));
//        }


/*        Using enhanced for loop for printing the arr 2   */

        for (int[] ints : arr2) {//ints is the elements of the array (arr2)
            System.out.println(Arrays.toString(ints));
        }



/*       Taking input for  the array        */
        for (int row=0; row<arr.length; row++)
        {
            // Taking input for the columns
            for (int col=0;col<arr[row].length;col++)
            {
                arr[row][col] = in.nextInt();
            }
        }


/*      now printing the array(arr) taken from the user   */

//        for (int row=0; row<arr.length; row++)
//        {
//
//            for (int col=0;col<arr[row].length;col++)
//            {
//                System.out.println(arr[row][col] + "" );
//            }
//            System.out.println(); //for new line
//        }


       /*  Other way of printing the arr    */


        for (int row =0; row<arr.length; row++)
        {
            System.out.println(Arrays.toString(arr[row]));
        }



     }
}
