package org.example.strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DetermineAnagrams {

    public static void main(String[] args) {


        String str1 = "sent";
        String str2 = "listen";

        String result = checkAnagrams(str1, str2);
        System.out.println(result);

    }

    public static String checkAnagrams(String str1,String str2){

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();


        if (str1.length() != str2.length()) {

            return "Strings with different length like " + str1 + " and " + str2+ " cannot be anagrams" ;
        }


        char[] strArr1 = str1.toCharArray();
        char[] strArr2 = str2.toCharArray();

        Arrays.sort(strArr1);
        Arrays.sort(strArr2);


        if (!Arrays.equals(strArr1, strArr2)) {
            return "both Strings are not Anagrams";

        }
            return "both strings are anagrams";

    }
}
