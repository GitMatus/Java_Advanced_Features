package com.sda.advanced.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsDifferences {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(5);
        numbers.add(4);

        numbers.add(0,55);

        printNumber(numbers);

        LinkedList<Integer> number2 = new LinkedList<>();


        List<Integer> numbers3 = new ArrayList<>();
        numbers.add(45);
        numbers.add(5);
        numbers.add(4);

        printNumber2(numbers3);


    }

    static void printNumber(ArrayList<Integer> nums){
        System.out.println(nums);
    }

    static void printNumber2(List<Integer> nums){
        System.out.println(nums);
    }

}
