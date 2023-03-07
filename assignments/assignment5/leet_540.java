package com.assignments.assignment5;

public class leet_540 {
    public static void main(String[] args) {
        System.out.println("find the first distinctive number");
        int [] arr ={1,1,2};
        System.out.println(singleNonDuplicate(arr));
    }
    static int singleNonDuplicate(int[] nums) {


        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] != nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 2;
            }
        }
        return nums[left];
    }
    }

