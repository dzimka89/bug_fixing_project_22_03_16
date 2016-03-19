package com;

import java.util.Arrays;

public class Problem_4 {
    public static void main(String[] args) {
        int[] masForCopy = new int[]{1, 3, 4, 5, 6, 7, 8};
        System.out.println("before changes " + masForCopy + " " + Arrays.toString(masForCopy));
        masForCopy = Arrays.copyOf(masForCopy, 3);
        //or
        System.arraycopy(masForCopy, 0, masForCopy, 0, 3 );
        System.out.println("after changes " + masForCopy + " " + Arrays.toString(masForCopy));//is it the same?)))))
    }
}
