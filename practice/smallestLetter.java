package com.practice;

public class smallestLetter {
    public static void main(String[] args) {
        System.out.println("finding the smallest letter just greater to the target element");
        char [] letters ={'a','d','g','j','l'};
        char target='l';
        System.out.println("letter just greater than the target is: "+findLetter(letters,target));
    }

    static char findLetter(char [] letters,char target)
    {
        int start=0;
        int end=letters.length-1;
        while (start <= end) {
            int mid= start+(end-start)/2;
            if (target>letters[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return letters[start%letters.length];
    }
}
