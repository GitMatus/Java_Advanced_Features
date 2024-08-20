package com.sda.advanced.collections;

import java.util.*;

public class Task {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(new Random().nextInt(51));
        }

        Map<Integer, Integer> integerMap = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
            if (integerMap.containsKey(num)) {
                int count = integerMap.get(num);
                count++;
                integerMap.put(num, count);
            } else {
                integerMap.put(num, 1);
            }

        }

//        System.out.println(integerMap);

//        List<Integer> uniqueList = new ArrayList<>();
//        List<Integer> repeatedList = new ArrayList<>();
//
//        for (int i = 0; i < integerMap.keySet().size(); i++) {
//            if (integerMap.get(i) == 1 && integerMap.get(i) != null) {
//                uniqueList.add(i);
//            } else {
//                repeatedList.add(i);
//            }
//        }
//
//        System.out.println(uniqueList);
//        System.out.println(repeatedList);


    }

}