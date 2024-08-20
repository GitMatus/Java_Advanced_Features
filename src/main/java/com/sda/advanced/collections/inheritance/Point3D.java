package com.sda.advanced.collections.inheritance;

public class Point3D extends Point2D {

    private float z;

    private Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public float[] getXYZ(float x, float y, float z) {
        return new float[] {getX(), getY(), z};
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setXY(x,y);
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("%f, %f, %f",getX(), getY(), z);
    }
}
