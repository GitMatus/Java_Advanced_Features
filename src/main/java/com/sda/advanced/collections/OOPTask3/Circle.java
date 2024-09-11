package com.sda.advanced.collections.OOPTask3;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public Circle() {
        super();
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea (double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter (double radius){
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius=%f which is a subclass of %s", radius, super.toString());
    }
}
