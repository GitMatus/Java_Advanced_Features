package com.sda.advanced.collections.OOPTask4;

public class AbstractCircle extends AbstractShape {
    private double radius;

    public AbstractCircle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public AbstractCircle() {
        super();
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea (){
        return (double) Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter (){
        return (double) Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius=%f which is a subclass of %s", radius, super.toString());
    }
}


