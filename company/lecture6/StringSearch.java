package com.company.lecture6;

import java.lang.annotation.Target;

public class StringSearch {
    public static void main(String[] args) {
        System.out.println("Searching a string");
        String  name = "Chakshit";
        char Target = 'z';
        System.out.println(ans(name,Target));

    }
    static boolean ans(String name, char target)
    {
        if(name.length()==0)
        {
            return false;
        }

        for (int i=0;i<name.length();i++)
        {
            if (target==name.charAt(i))
            {
                return true;
            }
        }
        return false;
    }

}
