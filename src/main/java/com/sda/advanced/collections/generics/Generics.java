package com.sda.advanced.collections.generics;

import com.sda.advanced.collections.Cat;

import java.util.ArrayList;

public class Generics<T> {

    T t;
    // Naming convention:
    //
    //    E - Element (used e.g. for Java Collection API)
    //    K - Key
    //    N - Number
    //    T - Type
    //    V - Value

    public Generics(T t) {
        this.t = t;
    }

    public T print(){
        System.out.println(t);
        return t;
    }

    public static void main(String[] args) {
        Generics<Integer> i = new Generics<>(5);
        Generics<String> s = new Generics<>("Hi");
        Generics<Character> ch = new Generics<>('L');
        Generics<Cat> cat = new Generics<>(new Cat());

        ArrayList<Generics> list = new ArrayList<>();
        list.add(i);
        list.add(s);
        list.add(ch);
        list.add(cat);

        for (Generics myClass : list){
            myClass.print();
        }
    }



}