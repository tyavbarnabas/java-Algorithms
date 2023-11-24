package org.example.strings;

public class countPunctuations {
    public static void main(String[] args) {

        String str = "Hello java, how can i be better?";

        int count = 0;

        for(int i = 0; i < str.length(); i++){

            if( str.charAt(i) == ',' || str.charAt(i) =='?'
                    || str.charAt(i)==';' || str.charAt(i) =='.' || str.charAt(i)=='/' ) {

                count++;

            }
        }

        System.out.println("total number of punctuations in the string = " + count);
    }
}
