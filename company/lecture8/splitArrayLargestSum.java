package com.company.lecture8;

public class splitArrayLargestSum {
    public static void main(String[] args) {
        System.out.println("Spiliting Arrays largest Sum:");
         int [] arr ={7,2,5,10,8};
         int m =2;
        System.out.println(splitArray(arr,m));
    }
    static int splitArray(int [] nums, int m)
    {
         int start=0;
        int end=0;

        for (int i=0;i<nums.length;i++)
        {
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
//         binary Search
        while (start < end) {

            int mid=start+(end-start)/2;

//            Calculate how many pieces can you divide
            int sum =0;
            int pieces=1;
            for (int num:nums)
            {
                if (sum + num>mid)
                {
//                    now we have to make the  new subarray
//                    After adding this num in the new array sum will be equal to the num
                    sum=num;
                    pieces++;
                }
                else{
//                    otherwise add this to the old Array
                    sum+=num;
                }
            }
            if (pieces>m){
                start = mid+1;
            }
            else {
                end=mid;
            }
        }
        return end;
    }
}
