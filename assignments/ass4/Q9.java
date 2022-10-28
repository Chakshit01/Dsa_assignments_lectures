package com.assignments.ass4;
import java.util.ArrayList;

import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {
        System.out.println("Create target Array in the given oder:");
        int [] nums={0,1,2,3,4};
        int [] index={0,1,2,2,1};

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            list.add(index[i],nums[i]);
        }
        int[] target = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            target[i] = list.get(i);
        }
        System.out.println(Arrays.toString(target));
    }
}
