package com.company.lecture4;

public class arguements {
    public static void main(String[] args) {
//        int ans=sum(5,6);
//       System.out.println(ans);
         String ans = name("Chakshit");
        System.out.println(ans);
    }

// static int sum(int a ,int b)
static String name(String nam)
    {
          String message = "How are you "+nam;
          return message;
//        int ans = a+b;
//        return ans;

    }
}
