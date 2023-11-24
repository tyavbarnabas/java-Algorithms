package org.example;

public class reverseNewString {



    public static void main(String[] args) {

        String inputString = "we all can be winners";

        String reversedString = reserveString(inputString);
        System.out.println("the reversed string is :" + reversedString);


    }

    public static String reserveString(String inputString){

        int length = inputString.length();
        char[] chars = inputString.toCharArray();
        char[] reversedArr  = new char[length];

        for(int i = 0 ; i < length; i++){
            reversedArr[i]= chars[length-1-i];
        }


        return new String(reversedArr);
    }



}
