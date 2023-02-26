package com.company.lecture11;

public class perfomance {
    public static void main(String[] args) {
        String series=""; // defined an empty string
        for (int i=0; i<26; i++)
        {
            /*  will firstly add the ascii value of the character
               and then will convert the resulted ascii value
                to the character */
            char ch = (char)('a'+i);
            System.out.println(ch);// will print all the characters
//            series=series+ch; //will add up all the characters upto z
        }

//        System.out.println(series);

//        immutability of the strings
        System.out.println('a' +"1"); // if one of the datatype is string then output will be in string only does'nt
                                      // matter what the other datatype is

    }
}
