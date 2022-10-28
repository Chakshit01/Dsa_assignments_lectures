package com.assignments.ass4;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Qq {
    public static void main(String[] args) {
        System.out.println("Finding max sum:");

    }

    static int getMaximumSum(List<Integer> val)
    {
        List<Integer> intValues = new ArrayList<>();
        for (int i=0;i< val.size();i++)
        {
             int[] arr = new int[5];
             arr[i] = val.get(i);
            int ans =0;
            for (int j=0;j<arr.length;j++)
            {
                int sol =arr[j];
                 ans =sol+ ans;
            }
            intValues.add(ans);
        }
        int max = Collections.max(intValues);
        return max;
    }
}
