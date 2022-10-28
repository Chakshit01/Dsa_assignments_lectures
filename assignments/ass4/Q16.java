package com.assignments.ass4;

public class Q16 {
    public static void main(String[] args) {
        System.out.println("Finding numbers with even number of digits");
        int[] arr ={555,901,482,1771};
        System.out.println(findNumber(arr));
    }
    static int findNumber(int[] arr)
    {
        int ans=0;


        for (int i=0;i<arr.length;i++)
        {
            int count =0;

            int sol = arr[i];
            while(sol>0)
            {
                int rem = sol%10;
                sol=sol/10;
                if (rem>=0)
                {
                    count++;
                }
            }
            if(count%2==0)
            {
               ans++;
            }
        }
        return ans;
    }
}
