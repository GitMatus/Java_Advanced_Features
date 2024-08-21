package com.sda.advanced.collections.TaskSchool;

public class Student extends Person {
    private String study;
    private int year;
    private float price;

    public Student(String name, String address, String study, int year, float price) {
        super(name, address);
        this.study = study;
        this.year = year;
        this.price = price;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Student{" +
                "study='" + study + '\'' +
                ", year=" + year + '\'' +
                ", price=" + price + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }
}
