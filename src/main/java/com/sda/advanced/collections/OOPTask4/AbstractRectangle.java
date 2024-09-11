package com.sda.advanced.collections.OOPTask4;

public class AbstractRectangle extends AbstractShape {
    protected double width;
    protected double length;

    public AbstractRectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public AbstractRectangle() {
        super();
        this.width = 1;
        this.length = 1;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea(){
        return (double) width * length;
    }

    @Override
    public double getPerimeter (){
        return (double) 2 * (width + length);
    }



    @Override
    public String toString() {
        return String.format("Rectangle with with=%f and length %f which is subclass of %s", width, length, super.toString());
    }
}