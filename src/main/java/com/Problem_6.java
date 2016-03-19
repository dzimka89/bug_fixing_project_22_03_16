package com;

public class Problem_6 {

    public static void recursivePrint(int num) {
        System.out.println("Number: " + num);

        if (num == 4)
            return;
        else
            recursivePrint(--num);
    }

    public static void main(String[] args) {
        Problem_6.recursivePrint(10);
    }

}
