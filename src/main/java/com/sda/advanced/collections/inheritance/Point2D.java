package com.sda.advanced.collections.inheritance;

import java.lang.reflect.Array;

public class Point2D {

    private float x;
    private float y;
    private Array array;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    private Point2D() {
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY() {
        return new float[]{x,y};
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
