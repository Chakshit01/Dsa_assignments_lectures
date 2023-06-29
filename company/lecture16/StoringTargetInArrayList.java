package com.company.lecture16;

import com.company.lecture5.Arraylist;

import java.util.ArrayList;

public class StoringTargetInArrayList {
    public static void main(String[] args) {
        System.out.println("Finding the index of the target and storing it in the ");
        int [] arr = {2,3,4,4,5,6};
        int target =4;
        ArrayList<Integer> list=  FindallIndex2(arr,target,0);
        System.out.println(list);
    }

//    static ArrayList<Integer> list = new ArrayList<>();
//
//    static ArrayList findAllIndices(int [] arr,int target, int index, ArrayList<Integer> list)
//    {
//        if(index==arr.length)
//        {
//            return list;
//        }
//
//        if(arr[index]==target)
//        {
//            list.add(index);
//        }
//
//        return findAllIndices(arr,target,index+1,list);
//    }

    static ArrayList<Integer> FindallIndex2(int []arr, int target, int index)
    {
        ArrayList<Integer> list = new ArrayList<>();

        if (index==arr.length){
            return list;
        }

        if (arr[index] == target)
        {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = FindallIndex2(arr,target,index+1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}
