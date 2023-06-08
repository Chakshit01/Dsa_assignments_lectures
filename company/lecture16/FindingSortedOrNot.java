package com.company.lecture16;

public class FindingSortedOrNot {
    public static void main(String[] args) {
        System.out.println("finding if the array is sorted or not");
        int [] arr = {1,2,3,4,5,7,6};
        System.out.println(Check(arr,0,true));
    }

    static String Check(int []arr,int s,boolean c)
    {

            if(!c)
            {
                return ("Not sorted");
            }
            if(s==arr.length-1)
            {
                return ("Sorted");
            }
            if(arr[s]<arr[s+1])
            {
                return Check(arr,s+1,true);
            }
            return Check(arr,s+1,false);







    }
}
