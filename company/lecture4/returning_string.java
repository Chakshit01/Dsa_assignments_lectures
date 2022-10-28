package com.company.lecture4;

public class returning_string {
    public static void main(String[] args) {
        String message=greet();//have to store the string returning type of the function in string value

        System.out.println(message);//will return the value of the function

    }
    static String greet(){
        String greeting="How are you";
        return greeting;
    }
}
