package org.example.strings;

public class CountCharactersInString {
    public static void main(String[] args) {
        String myString = "Hello From Java";

        int count = 0;

        for(int i =0;i < myString.length();i++){

            if(myString.charAt(i) != ' '){

                count++;
            }
        }


        System.out.println("total number of characters in the string = " + count);
    }
}