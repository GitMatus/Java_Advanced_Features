package com.sda.advanced.collections.abstract_and_interfaces.animal;

import com.sda.advanced.collections.abstract_and_interfaces.animal.classes.Animal;
import com.sda.advanced.collections.abstract_and_interfaces.animal.classes.Cat;
import com.sda.advanced.collections.abstract_and_interfaces.animal.classes.Dog;
import com.sda.advanced.collections.enums.Zodiac;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.poop(); // method from Animal class due to inheritance ("extends")

        cat.setColor("black");

        Cat cat2 = new Cat("blue",30,30,0);

        System.out.println(cat);
        System.out.println(cat2);

//        Animal animal = new Animal();  - cannot do this as it's abstract class
//        System.out.println(animal);

        Animal animal2 = new Cat();
        System.out.println(animal2); // polymorphizm

        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);

        System.out.println(animals);

        cat.setZodiac(Zodiac.ARIES);

        System.out.println(cat);

    }
}
