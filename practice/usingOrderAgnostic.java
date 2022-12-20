package com.practice;

public class usingOrderAgnostic {
    public static void main(String[] args) {
        System.out.println("using orderAgnostic");
        int [] arr= {8,7,6,5,4,3,2,1};
        int target= 3;
        System.out.println(orderAgnostic(arr,target));
    }

    static int orderAgnostic(int []arr, int target) {
        int start = 0;
         int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
            return -1;

    }
}
