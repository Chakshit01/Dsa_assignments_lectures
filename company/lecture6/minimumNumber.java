package com.company.lecture6;

public class minimumNumber {
    public static void main(String[] args) {
        System.out.println("Find the minimum number");
        int [] arr ={12,34,6,34,2,4,6};
        System.out.println(minValue(arr));

    }
    static int minValue(int [] arr)
    {
        int sol = arr[0];
        if (arr.length == 0) {
            return -1;
        }
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i] < sol) {
                sol=arr[i];
            }
        }
        return sol;
    }
}
