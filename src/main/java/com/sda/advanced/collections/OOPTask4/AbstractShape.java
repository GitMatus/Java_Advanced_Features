package com.sda.advanced.collections.OOPTask4;

public abstract class AbstractShape {

    protected String color;
    protected boolean isFilled;

    public AbstractShape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public AbstractShape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return String.format("Shape with color of %s and %s.", color, isFilled ? "filled" : "not filled");
    }
}
