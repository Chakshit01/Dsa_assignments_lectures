package com.assignments.ass4;

import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
        System.out.println("Find the highist altitude:");
        int [] arr ={-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }
    static int largestAltitude(int[] gain)
    {
        int k =gain.length;
        int [] ans = new int[k+1];
        ans[0]=0;
        int j=0;
        for (int i=1;i<k+1;i++)
        {

            ans[i]=gain[i-1]+j;
            j=ans[i];
        }
        System.out.println(Arrays.toString(ans));
        int max=Integer.MIN_VALUE;
        for (int i=0;i<ans.length;i++)
        {
//            To find maximum value of the array
            if (ans[i] > max) {
                max=ans[i];
            }

        }
        return max;
    }
}
