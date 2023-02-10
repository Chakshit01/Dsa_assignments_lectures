package com.company.lecture11;

public class StringsAndStringBuilders {
    public static void main(String[] args) {
        System.out.println("Comparision of Strings");
        String a= "Surya";
        String b="Surya";
        System.out.println(a==b);


//        Assigning same value of string in different pools of memory
         String name1 = new String("jaat");
         String name2 = new String("jaat");

        System.out.println(name1.equals(name2));

//    retrieving a character from the string
        System.out.println(name1.charAt(3));

    }
}
