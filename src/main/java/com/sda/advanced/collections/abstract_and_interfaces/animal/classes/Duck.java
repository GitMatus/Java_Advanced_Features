package com.sda.advanced.collections.abstract_and_interfaces.animal.classes;

import com.sda.advanced.collections.abstract_and_interfaces.animal.interfaces.FlyAble;
import com.sda.advanced.collections.abstract_and_interfaces.animal.interfaces.SwimAble;

public class Duck extends Animal implements SwimAble, FlyAble {


    @Override
    public void makeSound() {
        System.out.println("quack quack");
    }

    @Override
    public void swim() {
        System.out.println("duck is swimming");
    }

    @Override
    public void dive() {
        System.out.println("duck is diving");
    }

    @Override
    public void floatOnWater() {
        System.out.println("duck is floating");
    }

    @Override
    public void fly() {
        System.out.println("duck is flying");
    }

    @Override
    public void descend() {
        System.out.println("duck is descending");
    }

    @Override
    public void ascend() {
        System.out.println("duck is ascending");
    }
}
