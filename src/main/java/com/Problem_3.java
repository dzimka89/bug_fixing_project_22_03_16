package com;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Problem_3 {
    private final static int TOTAL_ELEMS = 10;
    private final static Random random = new Random();

    public static void main(String[] args) {
        Collection integers = new HashSet(TOTAL_ELEMS);

        for(int i = 0; i < TOTAL_ELEMS; ++i) {
            integers.add(random.nextInt());
        }
        System.out.println(integers);

//        Collection collection = Collections.unmodifiableCollection(integers);
        Collection collection = Collections.synchronizedCollection(integers);


        System.out.println(collection);
        collection.add(random.nextInt());
        System.out.println(collection);
    }
}
