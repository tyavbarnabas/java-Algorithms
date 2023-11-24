package org.example.strings;

public class CountVowelsInString {

    public static void main(String[] args) {

        String str = "A Hello java, how can i be better, YOU can";

        String newStr = str.toLowerCase();

        int count = 0;

        for(int i = 0; i < str.length(); i++){

            if(newStr.charAt(i) == 'a' || newStr.charAt(i) == 'i' || newStr.charAt(i) == 'e' ||
                    newStr.charAt(i) == 'o' || newStr.charAt(i) == 'u') {

                count++;
            }
        }


        System.out.println("total number of vowels in the string = " + count);
    }
}
