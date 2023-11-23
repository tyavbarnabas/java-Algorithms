package org.example;

public class ReverseString {

    public static void main(String[] args) {

        String originalString = "hello world";
        String reversedString = reverseString(originalString);
        System.out.println(reversedString);


    }

    public static String reverseString(String originalString){

        int length = originalString.length();
        char[] CharArray = originalString.toCharArray();
        char[] reverseArray = new char[length];

        for(int i = 0; i < length;i++){

            reverseArray[i] = CharArray[length-1-i];
        }
        return new String(reverseArray);
    }
}
