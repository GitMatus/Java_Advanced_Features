package com.sda.advanced.collections.annotations;

@VeryImportant

public class Cat {
    @ImportantString
    private  String color;

    private int age;

    public void meow() {
        System.out.println("meow");
    }

    @RunMethod(times = 2)
    public void poop() {
        System.out.println("poop");
    }

    public void setColor(String color) {
        this.color = color;
    }
}
