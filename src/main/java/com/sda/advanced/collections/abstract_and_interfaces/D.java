package com.sda.advanced.collections.abstract_and_interfaces;

public class D { // extends B, C - is not possible

        B b = new B(); // composition (using another class as field)
        C c = new C(); // composition (using another class as field)

        void printLetter() {
            b.printLetter();
            c.printLetter();

        }

    public static void main(String[] args) {
        D d = new D();
        d.printLetter();

    }
}
