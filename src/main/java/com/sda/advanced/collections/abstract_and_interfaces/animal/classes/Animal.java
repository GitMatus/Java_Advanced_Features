package com.sda.advanced.collections.abstract_and_interfaces.animal.classes;

import com.sda.advanced.collections.enums.Zodiac;

public abstract class Animal {

    private String color;
    private int weight;
    private int height;
    private int age;

    private Zodiac zodiac;

    public void setZodiac(Zodiac zodiac) {
        this.zodiac = zodiac;
    }

    public Animal(String color, int weight, int height, int age) {
        this.color = color;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public Animal() {
        this("brown", 30, 30, 0);

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }

    }

    public abstract void makeSound();

    public void poop() {
        System.out.println("poop");
    }

    public void sleep() {
        System.out.println("chrrrr");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " {color='" + color + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", age=" + age +
                ", zodiac=" + zodiac +
                '}';
    }


}


