package com.sda.advanced.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SDAArrayList<T> {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Olej");
        list.add("Cibula");
        list.add("Zemiak");
        list.add("Hovadzie");

        addList(list);
        System.out.println(list);
        removeList(list);
        System.out.println(list);


    }

    public static ArrayList addList(ArrayList list) {
        list.add("Paradajky");
        return list;
    }

    public static ArrayList removeList(ArrayList list) {
        list.remove(list.get(0));
        return list;

    }
}