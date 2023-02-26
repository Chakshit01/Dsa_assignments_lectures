package com.assignments.ass8;

public class q1 {
    public static void main(String[] args) {
        String address="1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
    static String defangIPaddr(String address) {
        char[] charArray = new char[address.length() + (2 * 3)];
        for (int i = 0, y = 0; i < address.length(); i++, y++) {
            char current = address.charAt(i);
            if (current == '.') {
                charArray[y++] = '[';
                charArray[y++] = current;
                charArray[y] = ']';
            } else {
                charArray[y] = current;
            }
        }
        return String.valueOf(charArray);
    }
}
