package com.sda.advanced.collections.OOPTask3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle ("white", true, 5);
        Rectangle rectangle = new Rectangle ("blue", true, 2, 3);
        Square square = new Square ("red", true, 5);



        System.out.println(circle);
        System.out.println(circle.getArea(10));

        System.out.println(square);
        System.out.println(square.getArea(15, 5));

    }
}
