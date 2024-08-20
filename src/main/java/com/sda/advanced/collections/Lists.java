package com.sda.advanced.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Matus");
        students.add("Marek");
        students.add("Stefan");

        students.remove("Lucia");

        students.set(1, "Lucia");


        ArrayList<String> students2 = new ArrayList<>();
        students.add("Stefan");
        students.add("Stefan");
        students.add("Silvia");
        students.add("Lucia");
        students.add("Jan");

        students.remove("Stefan");

        students.addAll(0, students2);

        System.out.println(students);

        System.out.println(students.contains("Stefan"));

        System.out.println(students.size());

        for (int i = 0; i < students.size(); i++) {
            System.out.println(i + 1 + " " + students.get(i));
        }

        for (String student : students) {
            if (student.toLowerCase().startsWith("s"))
                System.out.println(student);
        }

        for (Iterator<String> iterator = students.iterator(); iterator.hasNext();) {
            String item = iterator.next();
            if (item.toLowerCase().startsWith("s")){
                iterator.remove();
            }

        }

        System.out.println(students);
    }
}
