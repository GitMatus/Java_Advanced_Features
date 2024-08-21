package com.sda.advanced.collections.TaskSchool;

public class Lecturer extends Person{
    private String specialization;
    private float salary;

    public Lecturer(String name, String address, String specialization, float salary) {
        super(name, address);
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Lecturer{" + super.toString() +
                "specialization='" + specialization + '\'' +
                ", salary=" + salary + '\'' +
                '}';
    }
}
