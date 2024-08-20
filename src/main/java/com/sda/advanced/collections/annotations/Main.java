package com.sda.advanced.collections.annotations;

import com.sda.advanced.collections.inheritance.Dog;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat cat = new Cat();
        Dog dog = new Dog();

        if (cat.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("this cat is very important");
        }

        if (!dog.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("this dog is not very important");
        }
        for (Method m : cat.getClass().getDeclaredMethods()){
            if (m.isAnnotationPresent(RunMethod.class)){
                RunMethod runMethod = m.getDeclaredAnnotation(RunMethod.class);
                for (int i = 0; i < runMethod.times(); i++) {
                    m.invoke(cat);
                }

            }
        }

        cat.setColor("white");

        for (Field f : cat.getClass().getDeclaredFields()){
            if (f.isAnnotationPresent(ImportantString.class)){
                f.setAccessible(true);
                Object fieldValue = f.get(cat);
                if(fieldValue instanceof String stringValue){
                    System.out.println(stringValue.toUpperCase());
                }
            }
        }
    }
}
