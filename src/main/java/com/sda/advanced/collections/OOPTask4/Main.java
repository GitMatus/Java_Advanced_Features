package com.sda.advanced.collections.OOPTask4;

public class Main {
    public static void main(String[] args) {
        AbstractShape[] shapes = {
                new AbstractCircle("blue", true, 20),
                new AbstractRectangle("yellow", true, 20, 30),
                new AbstractSquare("green", false, 40)
        };
        for (AbstractShape shape : shapes) {
            System.out.println(shape);
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }
    }
}
