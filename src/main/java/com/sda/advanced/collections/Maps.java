package com.sda.advanced.collections;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
        ArrayList<String> students = new ArrayList<>();
        students.add("Matus");
        students.add("Marek");
        students.add("Stefan");
        students.add("Stefan");

        hashMap.put("JavaRemoteSK1", students);

        System.out.println(hashMap);

        // histogram

        String s = "asdfjkl;asdf";

        HashMap<Character, Integer> histogram = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (histogram.containsKey(c)){
                int count = histogram.get(c);
                count++;
                histogram.put(c, count);
            } else {
                histogram.put(c, 1);
            }
        }

        TreeMap<Character, Integer> histogram2 = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (histogram2.containsKey(c)){
                int count = histogram2.get(c);
                count++;
                histogram2.put(c, count);
            } else {
                histogram2.put(c, 1);
            }
        }

        LinkedHashMap<Character, Integer> histogram3 = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (histogram3.containsKey(c)){
                int count = histogram3.get(c);
                count++;
                histogram3.put(c, count);
            } else {
                histogram3.put(c, 1);
            }
        }

        System.out.println(histogram);

        System.out.println(histogram2);

        System.out.println(histogram3);

        Set<String> studentsSet = new HashSet<>();
        studentsSet.add("Matus");
        studentsSet.add("Marek");
        studentsSet.add("Stefan");
        studentsSet.add("Stefan");

        System.out.println(studentsSet);

    }
}
