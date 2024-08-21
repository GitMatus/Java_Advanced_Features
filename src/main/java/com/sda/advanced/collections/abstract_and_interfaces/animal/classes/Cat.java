package com.sda.advanced.collections.abstract_and_interfaces.animal.classes;

public class Cat extends Animal {

    public Cat(String color, int weight, int height, int age) {
        super(color, weight, height, age);
    }

    public Cat(){
        this ("brown", 30, 30, 0);

    }

    @Override
    public void makeSound() {
        System.out.println("meow");

    }


}
