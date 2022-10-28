package com.assignments.ass4;

public class Q10 {
    public static void main(String[] args) {
        System.out.println("Check weather the sentence is pangram or not ");
        String sentence ="thequickbrownfoxjumpsoverthelazydog";
        boolean ans = checkIfPangram(sentence);
        System.out.println(ans);
        }

    static boolean checkIfPangram(String sentence){
        boolean [] arr = new boolean[26];
        for (int i=0;i<sentence.length();i++)
        {
            arr[sentence.charAt(i)-97]=true;
        }
        for (int i=0;i<26;i++)
        {
            if (arr[i]==false)
            {
                return false;
            }
        }
        return true;
    }
}
