package com.company.lecture8;

public class SmallestLetter {
    public static void main(String[] args) {
        System.out.println("Find the smallest letter that is just greater than the target letter");
        char [] letters ={'c','d','e','f'};
        char target = 'f';
        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
    static char nextGreatestLetter(char[] letters, char target)
    {
        int start =0;
        int end = letters.length-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
    }
}
