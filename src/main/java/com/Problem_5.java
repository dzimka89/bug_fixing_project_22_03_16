package com;

import java.util.Arrays;

public class Problem_5 {
    public static void main(String[] args) {
        Integer[] integers = {1, 6, 4, 3, 2, 21, 1};

        int i = binarySearchIterative(integers, 21);
        System.out.println(i);//---6?
    }



    public static <T extends Number> int sortArray(T[] array){

        for (int i = 0; i < array.length-1 ; i++) {
            if (array[i].doubleValue() > array[i+1].doubleValue()) {
                T permValue = array[i];
                array[i] = array[i+1];
                array[i+1] = permValue;
                sortArray(array);
            }
        }
        return 1;
    }

    public static <T extends Number> int binarySearchIterative(T[] array, T keyElement) {
        int low = 0;
        int high = array.length - 1;
        sortArray(array);
        System.out.println(Arrays.toString(array));

        while (low <= high) {
            int avg = low + (high - low) / 2;
            if (keyElement == array[avg]) {
                return avg;
            } else if (keyElement.doubleValue() > array[avg].doubleValue()) {
                low = avg + 1;
            } else {
                high = avg - 1;
            }
        }
        return -1;
    }
}
