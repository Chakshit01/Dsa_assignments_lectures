package com.assignments.assignment5;

public class leet_441 {
    public static void main(String[] args) {
        System.out.println("Arranging coins");
        int n = 15;
        System.out.println(arrangeCoins(n)+"  rows completed");
    }

    static int arrangeCoins(int n) {
        int i = 1; // which row we are on
        while(n > 0){ // checking to see if we have used all our coins
            i++; // increasing our row
            n = n-i; // adding coins to our row
        }
        return i-1; // we return our current row minus one because the last row i
    }
}
