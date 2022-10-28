package com.assignments.ass4;

import java.util.ArrayList;

import java.util.Collections;

public class Q4 {
    public static void main(String[] args) {
        int maxWealthSoFar = 0;

        int [][] accounts={
                {1,2,3},
                {2,3,5}
        };



        ArrayList<Integer> sum= new ArrayList<>();
        for (int[] account : accounts) {
            int k = 0;
            for (int i : account) {
                k = i + k;
            }
            sum.add(k);

        }
        System.out.println(sum);
        System.out.println(Collections.max(sum));



//        // Iterate over accounts
//        for (int i = 0; i < accounts.length; i++) {
//            int[] account = accounts[i];
//            // For each account, initialize the sum to 0
//            int currCustomerWealth = 0;
//            // Add the money in each bank
//            for (int j = 0; j < account.length; j++) {
//                int money = account[j];
//                currCustomerWealth += money;
//            }
//            // Update the maximum wealth seen so far if the current wealth is greater
//            // If it is less than the current sum
//            maxWealthSoFar = Math.max(maxWealthSoFar, currCustomerWealth);
//        }
//
//        // Return the maximum wealth
//        System.out.println(maxWealthSoFar);
    }
}
