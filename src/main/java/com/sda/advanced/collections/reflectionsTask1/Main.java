package com.sda.advanced.collections.reflectionsTask1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Student student = new Student("jozko", "mrkvicka", 5, "IT");

        // methods

        Method[] methods = student.getClass().getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }

        System.out.println("----------");

        // fields

        Field[] fields = student.getClass().getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.getName());
        }

        System.out.println("----------");

        // constructors

        Constructor[] constructors = student.getClass().getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            System.out.println(constructor.getDeclaringClass().getSimpleName());
        }

        System.out.println("------");




        for (Method method : methods) {
            if (method.getName().substring(0, 3).equals("get")){
                method.invoke(student);
            }
        }

        System.out.println("--------");

        for (Field field : fields) {
            field.setAccessible(true);
            if (field.getName().equals("index")){
                field.set(student,10);
            } else field.set(student,"test");

        }

        System.out.println(student);


    }

}
