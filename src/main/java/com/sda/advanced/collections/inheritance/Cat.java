package com.sda.advanced.collections.inheritance;

public class Cat extends Animal {

    public Cat(String color, int weight, int height, int age) {
        super(color, weight, height, age);
    }

    public Cat(){
        this ("brown", 30, 30, 0);

    }


}


