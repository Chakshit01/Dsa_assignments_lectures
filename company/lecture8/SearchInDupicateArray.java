package com.company.lecture8;

public class SearchInDupicateArray {
    public static void main(String[] args) {
        System.out.println("Searching in the rotated Array with duplicate Array");
          int[] arr={5,5,8,2,2,2,3,4};
        System.out.println(searchPivot(arr));
    }
    static int searchPivot(int[] arr){
        int start=0;
        int end= arr.length-1;
       while(start<=end)
       {
           int mid= start+(end-start)/2;
//           Case 1:
            if (mid<end&&arr[mid]>arr[mid+1])
            {
                return mid;
            }


            else if(mid>start&&arr[mid]<arr[mid-1]){
                return mid-1;
            }
//            Case 2: Skip the repeating elements(duplicates)
            else if (arr[mid]==arr[start]&&arr[mid]==arr[end])
            {
//                check whether starting element is pivot or not
                if (arr[start]>arr[start+1]){
                    return start;
                }
//                Skip the starting duplicate elements
                start++;
//                Check whether end element is pivot or not
                 if (arr[end]<arr[end-1])
            {
                return end-1;
            }
//                 Skip the end duplicate items
                 end--;
            }
            else if (arr[start]<arr[mid]||(arr[start]==arr[mid]&&arr[mid]>arr[end]))
            {
                start=mid+1;

            }
            else{
                end=mid-1;
            }

       }
       return -1;
    }
}
