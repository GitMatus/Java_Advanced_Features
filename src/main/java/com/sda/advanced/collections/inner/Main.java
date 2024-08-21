package com.sda.advanced.collections.inner;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        System.out.println(outerClass);
        outerClass.hello();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass);
        innerClass.hello();

        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();
        System.out.println(nestedClass);
        nestedClass.hello();
    }
}
