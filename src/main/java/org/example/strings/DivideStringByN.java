package org.example.strings;

public class DivideStringByN {


    public static void main(String[] args) {


        String str = "my whole year was dedicated to studying strings";

        String newStr = str.replaceAll("\\s+", "");

        int strLength = newStr.length();

        int n = 2;

        int count = 0;

        int numOfCharsInStr = strLength/n;


        String[] equalArr = new String[n];


        if(strLength % n != 0){

            System.out.println( "this string cannot be divided into " + n + "equal parts");

        }else {

            for(int i = 0; i < strLength; i = i + numOfCharsInStr){

                String part = newStr.substring(i, i + numOfCharsInStr);

                equalArr[count] = part;

                count++;


            }

            System.out.println( n + " equal parts of string are ");

            for(int i = 0; i < equalArr.length;i++){

                System.out.println(equalArr[i]);
            }



        }








    }


}
