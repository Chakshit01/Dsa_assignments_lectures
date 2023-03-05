package com.assignments.assignment5;

public class leet_1346 {
    public static void main(String[] args) {
        System.out.println("check whether the no and its double exists");
        int [] arr= {10,4,5,3};
        System.out.println(checkDouble(arr));
    }

    static boolean checkDouble(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {

            for (int j=0;j<arr.length;j++)
            {
                if(i!=j) {
                    if (arr[i] != 2 * arr[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
