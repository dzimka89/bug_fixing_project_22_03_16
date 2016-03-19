package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Problem_1 {

    public static void main(String[] args) {
        String[] membersArray = new String[]{"1", "2", "3", "4", "5"};
        List<String> membersList = new ArrayList<String>(Arrays.asList(membersArray));//говорили на паре - вспомните за remove и add --- есть некоторые траблы) обойдти можно
        List<String> seeAlso1 = new ArrayList<String>();



//        for (String member : membersList) {
//            List<String> seeAlso = null;
//            if (!seeAlso.contains(member)) {
//                seeAlso.add(member);
//            }
//        }

        for (String member : membersList) {
            List<String> seeAlso = new ArrayList<String>(); // creating an objext of ArrayList type, because method asList returns us ArrayList object
            if (!seeAlso.contains(member)) {
                seeAlso.add(member);
                seeAlso1.add(member);
            }
        }

        System.out.println(seeAlso1);



        System.out.println(membersList);

        while(!membersList.isEmpty()){
            membersList.remove(0);
        }

        System.out.println(membersList);






    }

}

