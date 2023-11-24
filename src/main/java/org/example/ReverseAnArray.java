package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] inputArray = {1,2,3,4,5};

        System.out.println("original array");
        printArray(inputArray);

        reverseAnArray(inputArray);

        System.out.println("reversed array");
        printArray(inputArray);


    }


    public static void reverseAnArray(int[] array){

        int length = array.length;

        int temp;

        for(int i = 0; i < length/2;i ++){

            temp = array[i];
            array[i] = array[length-1-i];
            array[length-1-i] = temp;

        }



    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
