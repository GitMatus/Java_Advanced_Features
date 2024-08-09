package com.sda.advanced.collections;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] words = input.toLowerCase().split(" ");

        Map<String, Integer> wordsCount = new LinkedHashMap<>();

        for (int i = 0; i < words.length; i++) {
            Integer count = wordsCount.get(words[i]);
            if (wordsCount.containsKey(words[i])) {
                count++;
                wordsCount.put(words[i], count);
            } else
                wordsCount.put(words[i], 1);
        }
//        for (int i = 0; i < words.length; i++) {
//            System.out.println(words[i]);
//        }
//        System.out.println(wordsCount);


        // Googled solution
        System.out.println(Collections.max(wordsCount.entrySet(), Map.Entry.comparingByValue()).getKey());

        // My solution
        int max = 0;
        String maxWord = "";

        for (int j = 0; j < words.length; j++) {

            if (wordsCount.get(words[j]) > max) {
                max = wordsCount.get(words[j]);
                maxWord = words[j];
            }
        }

        System.out.println(maxWord);

    }
}
