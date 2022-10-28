package com.company.lecture6;

public class EvenDigits {
    public static void main(String[] args) {
        System.out.println("Count the number of even digits");
        int [] arr = {324,56,87,234,4656};
        System.out.println(EvenNumber(arr ));
    }
    static int EvenNumber(int []arr)
    {
        int count=0;
        for (int num : arr)
        {
          if (even(num))
          {
              count++;
          }
        }
        return count;
    }
    static boolean even(int num)
    {
        int n = digits(num);
        return n%2==0;
    }
    static int digits(int num)
    {
        int count =0;

        while (num > 0) {
            count++;
            num=num/10;
        }
        return count;
    }
}
