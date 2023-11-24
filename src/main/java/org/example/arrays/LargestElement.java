package org.example.arrays;

public class LargestElement {

    public static void main(String[] args) {

        int[] inputArray = {23,54,65,75,22};

        int maxArray = largestElement(inputArray);
        System.out.println("max value:" + maxArray);
    }



    public static int largestElement(int[] array){

        int max = array[0];

        int length = array.length;

        for(int i = 0; i < length;i++){

            if(array[i] > max){
                max = array[i];
            }
        }


        return max;
    }

}
