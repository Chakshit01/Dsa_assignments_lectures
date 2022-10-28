package com.assignments.ass4;

import java.util.ArrayList;
import java.util.List;

public class q11 {
    public static void main(String[] args) {
        System.out.println("Count the items on the basis of a rule ");

    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue)
    {
       int ans =0;
       if (ruleKey.equals("type"))
       {
           for (int i=0;i<items.size();i++)
           {
               if (items.get(i).get(0).equals(ruleValue))
               {
                   ans++;
               }
           }
       }
       if (ruleKey.equals("color"))
       {
           for (int i=0;i<items.size();i++)
           {
               if (items.get(i).get(1).equals(ruleValue))
               {
                   ans++;
               }
           }
       }
       if (ruleKey.equals("name"))
       {
           for (int i=0;i<items.size();i++)
           {
               if (items.get(i).get(2).equals(ruleValue))
               {
                   ans++;
               }
           }
       }
       return ans;
    }
}
