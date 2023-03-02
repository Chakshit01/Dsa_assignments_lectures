package com.assignments.assignment5;public class leet_367 {

    public static void main(String[] args) {
        System.out.println("find the valid square");
        int n=16;
        System.out.println(isPerfectSquare(n));;

    }

    static boolean isPerfectSquare(int num) {
        int low = 1, high = num;
        while (low <= high) {
            long mid = (low + high) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        return false;
    }
}
