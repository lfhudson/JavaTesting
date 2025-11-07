package com.sparta.lh.oop.zoo;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App {
    static void main(String[] args) {
        Elephant elle = new Elephant("Elle", 2000, 1, 1, 5500);
        Bear barney = new Bear("Barney", 2020, 4,20,"Brown");
        Bear barney1 = new Bear("Barney", 2020, 4,20,"Brown");
        Cat jack = new Cat("Jack", 2009, 1,1,"Black");
        Bee bert = new Bee("Bert", 2025, 5,1,"Fast");

        ArrayList<Animal> animals = new ArrayList<>(List.of(elle, barney,jack,bert));
        for (Animal animal : animals) {
//            System.out.println(animal.toString());
//            System.out.println(animal.speak());
             System.out.println(animal.move());
        }
        for (Animal animal : animals) {
            System.out.println(animal.friends());
        }

        HashSet<Bear> setMembers = new HashSet<>();
        setMembers.add(barney);
        setMembers.add(barney1);
        System.out.println(setMembers);

//        System.out.println(elle.getName());
//        System.out.println(elle.getAge());
//        System.out.println(elle.getWeight());
//        System.out.println(elle.speak());
//        elle.setName("El");
//        System.out.println(elle.getName());
//        System.out.println(elle.toString());
//
//        System.out.println(barney.getName());
//        System.out.println(barney.getAge());
//        System.out.println(barney.getColour());
//        System.out.println(barney.speak());
//        barney.setName("Bee");
//        System.out.println(barney.getName());
//        System.out.println(barney.toString());

    }
}
