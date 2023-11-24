package org.example.strings;

public class ConvertCase {

    public static void main(String[] args) {

        StringBuffer newString = convertCase("The Healing Power Of God");
        System.out.println("our new String: " + newString);

        System.out.println("");

    }


    public static StringBuffer convertCase(String stringToBeConvert){

        StringBuffer newString = new StringBuffer(stringToBeConvert);
        System.out.println(newString);


        for(int i = 0 ; i < stringToBeConvert.length();i ++){

            if(Character.isLowerCase(stringToBeConvert.charAt(i))){

                newString.setCharAt(i, Character.toUpperCase(stringToBeConvert.charAt(i)));

            }else if( Character.isUpperCase(stringToBeConvert.charAt(i)) ){

                newString.setCharAt(i, Character.toLowerCase(stringToBeConvert.charAt(i)));
            }
        }
        return newString;
    }
}
