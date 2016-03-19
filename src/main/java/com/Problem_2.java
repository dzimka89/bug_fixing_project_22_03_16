package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {12,34,56,78,98,23};
        List<Integer> aList = new ArrayList<Integer>(Arrays.asList(arr)); // Actually I didn't fully understand why our actions with aList had influence to our array( whe we using Arrays.asList)
        System.out.println(arr[2]);                         // maybe cos method asList is static, is it?
        aList.set(2, 22);
        System.out.println(arr[2]);
    }
}
